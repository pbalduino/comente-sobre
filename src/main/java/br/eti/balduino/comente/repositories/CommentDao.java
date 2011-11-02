package br.eti.balduino.comente.repositories;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.eti.balduino.comente.models.Comment;

@Component
public class CommentDao {

	private Session session;

	public CommentDao(Session session) {
		this.session = session;
	}

	public void save(Comment comment) {
		comment.setPosted(new Date());
		session.save(comment);
	}

	@SuppressWarnings("unchecked")
	public List<Comment> findBySubject(String subject) {
		return session.createCriteria(Comment.class)
				.add(Restrictions.eq("subject", subject))
				.addOrder(Order.desc("posted"))
				.list();
	}
}