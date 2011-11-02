package br.eti.balduino.comente.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private long id;

	@NotEmpty(message = "Informe o assunto")
	private String subject;

	@NotEmpty(message = "Você precisa escrever seu comentário")
	@Type(type = "text")
	private String content;

	@NotEmpty(message = "Informe o email")
	@Email(message = "Informe um email válido")
	@Size(max = 60)
	private String email;

	private Date posted;

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

	public void setPosted(Date posted) {
		this.posted = posted;
	}

	public Date getPosDate() {
		return posted;
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
