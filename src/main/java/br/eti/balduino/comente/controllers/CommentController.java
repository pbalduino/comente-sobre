package br.eti.balduino.comente.controllers;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.eti.balduino.comente.models.Comment;
import br.eti.balduino.comente.repositories.CommentDao;

@Resource
public class CommentController {
	private Result result;
	private CommentDao dao;

	public CommentController(CommentDao dao, Result result) {
		this.dao = dao;
		this.result = result;
	}

	@Get("/")
	public void index() {
		//
	}

	@Get("/{subject}")
	public void content(String subject) {
		result.include("subject", subject);
	}

	@Post("/what")
	public void subject(final String subject) {
		result.include("notice", "Quero comentar sobre " + subject);
		result.redirectTo(CommentController.class).content(subject);
	}

	@Post("/list")
	public List<Comment> save(Comment comment) {
		System.out.println("..........saving");
		dao.save(comment);
		System.out.println("..........saved");

		return dao.listAll();
	}
}
