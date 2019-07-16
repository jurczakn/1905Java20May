package com.revature.beans;

import org.springframework.stereotype.Component;

@Component
public class StandardWindow implements Window {
	
	private String size;
	
	private String type;
	
	private boolean open;
	
	@Override
	public String toString() {
		return "StandardWindow [size=" + size + ", type=" + type + ", open=" + open + "]";
	}

	public StandardWindow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StandardWindow(String size, String type, boolean open) {
		super();
		this.size = size;
		this.type = type;
		this.open = open;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	@Override
	public String getSize() {
		return this.size;
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public boolean isOpen() {
		return this.open;
	}

}
