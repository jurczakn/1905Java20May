package com.revature.domains;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAVE")
public class Cave {
	
	@Id
	@Column(name="CAVE_ID")
	@SequenceGenerator(name="CAVEID_SEQ", sequenceName="CAVEID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CAVEID_SEQ")
	private int caveId;
	
	@Column(name="CAVE_TYPE")
	private String caveType;
	
	@Column(name="SQ_FOOTAGE")
	private double sqFootage;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.MERGE, mappedBy="bearHome")
	private Set<Bear> residents = new HashSet<Bear>();
	
	public Cave(int caveId, String caveType, double sqFootage, List<Bear> bears) {
		super();
		this.caveId = caveId;
		this.caveType = caveType;
		this.sqFootage = sqFootage;
		//this.bears = bears;
	}


/*	public List<Bear> getBears() {
		return bears;
	}

	public void setBears(List<Bear> bears) {
		this.bears = bears;
	}*/

	public int getCaveId() {
		return caveId;
	}

	public void setCaveId(int caveId) {
		this.caveId = caveId;
	}

	public String getCaveType() {
		return caveType;
	}

	public void setCaveType(String caveType) {
		this.caveType = caveType;
	}

	public double getSqFootage() {
		return sqFootage;
	}

	public void setSqFootage(double sqFootage) {
		this.sqFootage = sqFootage;
	}

	public Cave(int caveId, String caveType, double sqFootage) {
		super();
		this.caveId = caveId;
		this.caveType = caveType;
		this.sqFootage = sqFootage;
	}

	public Cave(String caveType, double sqFootage) {
		
		super();
		this.caveType = caveType;
		this.sqFootage = sqFootage;
		
	}
	
	public Cave() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "Cave [caveId=" + caveId + ", caveType=" + caveType + ", sqFootage=" + sqFootage + "]";
	}

	
	
	

}
