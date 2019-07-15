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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="BEAR")
@NamedQueries({
	@NamedQuery(name="get_small_bears", query="FROM Bear as b WHERE b.weight < 200"),
	@NamedQuery(name="get_large_bears", query="FROM Bear as b WHERE b.weight > :amount")
})
@Cache(region="myAwesomeCache", usage = CacheConcurrencyStrategy.READ_ONLY)
public class Bear {
	
	@Id
	@Column(name="BEAR_ID")
	@SequenceGenerator(name="BEARID_SEQ", sequenceName="BEARID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BEARID_SEQ")
	private int bearId;
	
	@Column(name="BEAR_COLOR")
	private String bearColor;
	
	@Column(name="BREED")
	private String breed;
	
	@Column(name="HEIGHT")
	private double height;
	
	@Column(name="WEIGHT")
	private double weight;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="BEAR_HOME")
	private Cave bearHome;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="HONEYPOT_ID")
	private HoneyPot honeyPot;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="PARENT_CUB", 
				joinColumns=@JoinColumn(name="PARENT_ID"), 
				inverseJoinColumns=@JoinColumn(name="CUB_ID"))
	private Set<Bear> bearCubs;

	public Set<Bear> getChildren() {
		return bearCubs;
	}

	public void setChildren(Set<Bear> children) {
		this.bearCubs = children;
	}

	public Bear(int bearId, String bearColor, String breed, double height, double weight, Cave bearHome,
			HoneyPot honeyPot, List<Bear> parents, Set<Bear> children) {
		super();
		this.bearId = bearId;
		this.bearColor = bearColor;
		this.breed = breed;
		this.height = height;
		this.weight = weight;
		this.bearHome = bearHome;
		this.honeyPot = honeyPot;
		this.bearCubs = children;
	}

	public int getBearId() {
		return bearId;
	}

	public void setBearId(int bearId) {
		this.bearId = bearId;
	}

	public String getBearColor() {
		return bearColor;
	}

	public void setBearColor(String bearColor) {
		this.bearColor = bearColor;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Cave getBearHome() {
		return bearHome;
	}

	public void setBearHome(Cave bearHome) {
		this.bearHome = bearHome;
	}

	public HoneyPot getHoneyPot() {
		return honeyPot;
	}

	public void setHoneyPot(HoneyPot honeyPot) {
		this.honeyPot = honeyPot;
	}

	public Bear(int bearId, String bearColor, String breed, double height, double weight, Cave bearHome,
			HoneyPot honeyPot) {
		this();
		this.bearId = bearId;
		this.bearColor = bearColor;
		this.breed = breed;
		this.height = height;
		this.weight = weight;
		this.bearHome = bearHome;
		this.honeyPot = honeyPot;
	}

	public Bear() {
		super();
		// TODO Auto-generated constructor stub
		this.bearCubs = new HashSet<Bear>();
	}

	public Bear(String bearColor, String breed, double height, double weight, HoneyPot honeyPot) {
		this();
		this.bearColor = bearColor;
		this.breed = breed;
		this.height = height;
		this.weight = weight;
		this.honeyPot = honeyPot;
	}

	@Override
	public String toString() {
		return "Bear [bearId=" + bearId + ", bearColor=" + bearColor + ", breed=" + breed + ", height=" + height
				+ ", weight=" + weight + ", bearHome=" + bearHome + ", honeyPot=" + honeyPot + ", parents="
				+ ", children=" + bearCubs + "]";
	}


	
	

}
