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
	public void content(String subject){
		result.include("subject", subject);
	}

	@Post("/what")
	public void subject(final String subject) {
		result.include("notice", "Quero comentar sobre " + subject);
		result.redirectTo(CommentController.class).content(subject);
	}
}
	