package br.eti.balduino.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {

	private String name;
	private long id;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return id + " - " + name;		
	}
	
	@Override
	public int hashCode(){
		return (int) (name.hashCode() + id);
		
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
		final Subject other = (Subject) obj;
		return (id == other.id && name.equals(other.name));		
	}

	public String getName() {
		return name;
	}


}
