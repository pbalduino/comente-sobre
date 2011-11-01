package br.eti.balduino.comente.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.eti.balduino.comente.models.Comment;

@Component
public class CommentDao {

	private Session session;

	public CommentDao(Session session) {
		this.session = session;
	}

	public void save(Comment comment) {
		System.out.println("....before save: " + comment.getId());
		session.save(comment);
		System.out.println("....after save : " + comment.getId());
	}

	@SuppressWarnings("unchecked")
	public List<Comment> listAll() {
		List<Comment> list = session.createQuery("from Comment").list();
		System.out.println("...Itens: " + list.size());
		return list;
	}
}