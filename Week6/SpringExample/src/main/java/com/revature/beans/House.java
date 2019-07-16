package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class House {
	
	private String name;
	
	private String owner;
	
	//@Autowired  --do not put on the field
	private Window window;
	
	@Override
	public String toString() {
		return "House [name=" + name + ", owner=" + owner + ", window=" + window + "]";
	}

	public House() {
		super();
	}

	//@Autowired
	public House(StandardWindow window) {
		this.window = window;
	}
	
	public House(String name, String owner, Window window) {
		super();
		this.name = name;
		this.owner = owner;
		this.window = window;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Window getWindow() {
		return window;
	}

	@Autowired
	@Qualifier("window")
	public void setWindow(Window window) {
		this.window = window;
	}
	
	

}
