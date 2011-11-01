package br.eti.balduino.comente.repositories;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.eti.balduino.comente.models.Comment;

@Component
@SessionScoped
public class CommentDao {

	private Session session;

	public CommentDao(Session session) {
		this.session = session;
	}

	public void save(Comment comment) {
//		Transaction tx = session.beginTransaction();
		session.save(comment);
//		tx.commit();
	}
}