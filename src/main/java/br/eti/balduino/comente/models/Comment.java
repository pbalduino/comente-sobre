package br.eti.balduino.comente.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private long id;

	@NotEmpty
	private String subject;
	
	@NotEmpty
	private String content;
	
	@NotEmpty
	@Email
	private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return getId() + " - " + getEmail() + " - " + getSubject() + " - "
				+ getContent();
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Comment other = (Comment) obj;
		return (hashCode() == other.hashCode() && getId() == other.getId()
				&& getSubject().equals(other.getSubject()) && getEmail()
				.equals(other.getEmail()));
	}
}
