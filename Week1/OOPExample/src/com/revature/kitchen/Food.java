package com.revature.kitchen;

public class Food {
	
	private String color;
	
	private String smell;
	
	private String type;
	
	private double amount;
	
	private double cost;
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getSmell() {
		return this.smell;
	}
	
	public void setSmell(String smell) {
		this.smell = smell;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public Food eat() {
		System.out.println("You just ate " + this.amount + " pounds of " + this.type);
		this.amount = 0.0;
		return this;
	}
	
	//Constructor is used to create an instance of a class, an object
	//Invoked by using the new keyword
	//    V------does not a return type
	//      VV---------shares the name of class
	public Food() {
		this.color = "color";
		this.smell = "good";
		this.type = "salty";
		this.amount = 0.1;
		this.cost = 5.0;
	}
	
	public Food(String type, String color, String smell, double amount, double cost) {
		this.color = color;
		this.type = type;
		this.smell = smell;
		this.amount = amount;
		this.cost = cost;
	}

}
