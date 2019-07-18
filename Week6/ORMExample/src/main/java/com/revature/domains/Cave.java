package com.revature.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="cave")
public class Cave {

	@Id
	@Column(name="cave_id")
	@GenericGenerator(name="caveid_seq",
						strategy="org.hibernate.id.enhanced.SequenceStyleGenerator",
						parameters = {
								@Parameter(name="sequence_name", value="cave_seq")
						})
	@GeneratedValue(generator="caveid_seq")
	private Integer id;
	
	@Column(name="type")
	private String type;
	
	@Column(name="sq_footage")
	private Double sqFootage;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getSqFootage() {
		return sqFootage;
	}

	public void setSqFootage(Double sqFootage) {
		this.sqFootage = sqFootage;
	}

	public Cave(Integer id, String type, Double sqFootage) {
		super();
		this.id = id;
		this.type = type;
		this.sqFootage = sqFootage;
	}

	public Cave() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cave [id=" + id + ", type=" + type + ", sqFootage=" + sqFootage + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((sqFootage == null) ? 0 : sqFootage.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Cave other = (Cave) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (sqFootage == null) {
			if (other.sqFootage != null)
				return false;
		} else if (!sqFootage.equals(other.sqFootage))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
