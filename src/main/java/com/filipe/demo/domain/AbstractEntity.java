package com.filipe.demo.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

//Informa a JPA que essa será uma superclasse das entidades que serão implementadas.
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable{
	
	//@ID indica que esse será o ID. @GeneratedValue é utilizada em banco de dados MySql e informa a JPA...
	//...que a geração do ID será feita de forma automatica pelo banco de dados e não pela aplicação.
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	
	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntity<?> other = (AbstractEntity<?>) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "id=" + id;
	}

}
