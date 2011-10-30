package br.eti.balduino.comente.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {

	private long id;
	private String subject;
	private String content; 

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSubject(String name) {
		this.subject = name;
	}
	
	@Override
	public String toString(){
		return id + " - " + subject + " - " + content;
	}
	
	@Override
	public int hashCode(){
		return toString().hashCode();
	}
	
	@Override
	public boolean equals(Object obj){
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
		return (hashCode() == other.hashCode() && id == other.id && subject.equals(other.subject));		
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


}
