package com.revature.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

public class Player {

	private String name;
	
	private double battingAverage;
	
	private int rbi;
	
	private int homeruns;
	
	private Team team;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(double battingAverage) {
		this.battingAverage = battingAverage;
	}

	public int getRbi() {
		return rbi;
	}

	public void setRbi(int rbi) {
		this.rbi = rbi;
	}

	public int getHomeruns() {
		return homeruns;
	}

	public void setHomeruns(int homeruns) {
		this.homeruns = homeruns;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Player(String name, double battingAverage, int rbi, int homeruns, Team team) {
		super();
		this.name = name;
		this.battingAverage = battingAverage;
		this.rbi = rbi;
		this.homeruns = homeruns;
		this.team = team;
	}

	public Player() {
		super();
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", battingAverage=" + battingAverage + ", rbi=" + rbi + ", homeruns=" + homeruns
				+ ", team=" + team + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(battingAverage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + homeruns;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rbi;
		result = prime * result + ((team == null) ? 0 : team.hashCode());
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
		Player other = (Player) obj;
		if (Double.doubleToLongBits(battingAverage) != Double.doubleToLongBits(other.battingAverage))
			return false;
		if (homeruns != other.homeruns)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rbi != other.rbi)
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		return true;
	}
	
}