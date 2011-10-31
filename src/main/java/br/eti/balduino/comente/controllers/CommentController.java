package br.eti.balduino.comente.controllers;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.eti.balduino.comente.models.Comment;

@Resource
public class CommentController {
	private Result result;

	public CommentController(Result result) {
		this.result = result;	
	}
	
	@Get("/")
	public void index(){
		//
	}
	
	@Get("/{subject}")
	public void showWhatever(String subject){
		result.include("subject", subject);
		result.include("notice", subject);
		result.redirectTo(CommentController.class).index();
	}

	@Post("/new")
	public void newComment(final Comment comment) {
		result.include("subject", comment == null ? "<null>" : comment.getSubject());
		result.include("notice", "funcionou");
		result.redirectTo(CommentController.class).index();
	}
}
	