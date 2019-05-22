package com.revature.kitchen;

public class MexicanFood extends Food{
	
	private boolean hasCheese;
	private boolean hasBeans;
	private String typeOfShell;
	
	public boolean getHasCheese() {
		return hasCheese;
	}
	
	public void setHasCheese(boolean hasCheese) {
		this.hasCheese = hasCheese;
	}
	
	public boolean getHasBeans() {
		return hasBeans;
	}
	
	public void setHasBeans(boolean hasBeans) {
		this.hasBeans = hasBeans;
	}
	
	public String getTypeOfShell() {
		return this.typeOfShell;
	}
	
	public void setTypeOfShell(String typeOfShell) {
		this.typeOfShell = typeOfShell;
	}
	
	
	
}
