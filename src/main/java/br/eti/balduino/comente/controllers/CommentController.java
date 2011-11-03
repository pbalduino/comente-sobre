package br.eti.balduino.comente.controllers;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.eti.balduino.comente.models.Comment;
import br.eti.balduino.comente.repositories.CommentDao;

@Resource
public class CommentController {
	private Result result;
	private CommentDao dao;
	private Validator validator;

	public CommentController(CommentDao dao, Validator validator, Result result) {
		this.dao = dao;
		this.validator = validator;
		this.result = result;
	}

	@Get("/")
	public void index() {
		//
	}

	@Path(value = "/{subject}", priority = Path.LOW)
	@Get
	public void content(String subject) {
		result.include("subject", subject);
	}

	@Path("/what")
	public void subject(final String subject) {
		if (subject.trim().equals("")) {
			result.include("error", "Informe o assunto");
			result.redirectTo(CommentController.class).index();
		} else {
			result.include("error", null);
			result.include("notice", "Quero comentar sobre " + subject);
			result.redirectTo(CommentController.class).content(subject);
		}
	}
	
	@Path("/list")
	public List<Comment> list(Comment comment) {
		validator.validate(comment);

		System.out.println(validator.getErrors());

		result.include(comment);
		validator.onErrorRedirectTo(CommentController.class).subject(comment.getSubject());

		dao.save(comment);

		return dao.findBySubject(comment.getSubject());
	}
}
