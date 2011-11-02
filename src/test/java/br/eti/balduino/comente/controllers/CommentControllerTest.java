package br.eti.balduino.comente.controllers;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.vraptor.util.test.MockResult;
import br.eti.balduino.comente.models.Comment;
import br.eti.balduino.comente.repositories.CommentDao;

public class CommentControllerTest {

	private CommentController commentController;

	@Before
	public void setUp() {
		MockResult result = new MockResult();
		Session session = mock(Session.class);
		Query query = mock(Query.class);
		CommentDao dao = new CommentDao(session);

		when(session.createQuery("from Comment")).thenReturn(query);
		when(query.list()).thenReturn(new ArrayList<Comment>());

		commentController = new CommentController(dao, result);
	}

	@Test
	public void meh() {
		commentController.save(new Comment());
	}
}
