package com.revature.pojo;

public class Project0 {
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Project0 - " + this.name + " has been garbage collected");
	}

	private String name;

	public Project0(String name) {
		super();
		this.name = name;
	}


	public Project0() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Project0 [name=" + name + "]";
	}
	
}
