package com.revature.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "bear")
public class Bear {
	
	@Id
	@Column(name="bear_id")
	@GenericGenerator(name="bearid_seq",
						strategy="org.hibernate.id.enhanced.SequenceStyleGenerator",
						parameters = {
								@Parameter(name="sequence_name", value="bear_seq")
						})
	@GeneratedValue(generator="bearid_seq")
	private Integer id;
	
	@Column(name="color")
	private String color;
	
	@Column(name="necessities")
	private String necessities;
	
	@Column(name="breed")
	private String breed;
	
	@Column(name="legs")
	private Integer legs;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNecessities() {
		return necessities;
	}

	public void setNecessities(String necessities) {
		this.necessities = necessities;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Integer getLegs() {
		return legs;
	}

	public void setLegs(Integer legs) {
		this.legs = legs;
	}

	public Bear(Integer id, String color, String necessities, String breed, Integer legs) {
		super();
		this.id = id;
		this.color = color;
		this.necessities = necessities;
		this.breed = breed;
		this.legs = legs;
	}

	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bear [id=" + id + ", color=" + color + ", necessities=" + necessities + ", breed=" + breed + ", legs="
				+ legs + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((legs == null) ? 0 : legs.hashCode());
		result = prime * result + ((necessities == null) ? 0 : necessities.hashCode());
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
		Bear other = (Bear) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (legs == null) {
			if (other.legs != null)
				return false;
		} else if (!legs.equals(other.legs))
			return false;
		if (necessities == null) {
			if (other.necessities != null)
				return false;
		} else if (!necessities.equals(other.necessities))
			return false;
		return true;
	}
	
}
