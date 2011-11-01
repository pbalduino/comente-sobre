package br.eti.balduino.comente.controllers;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.vraptor.util.test.MockResult;

public class CommentControllerTest {

	private CommentController commentController;

	@Before
	public void setUp(){
		MockResult result = new MockResult();
		commentController = new CommentController(null, result);
	}
	
	@Test
	public void meh(){
		commentController.content("foo");
		commentController.subject("foo");
		commentController.index();
	}
}
