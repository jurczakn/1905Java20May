package com.revature.kitchen;

public class ChineseFood extends Food{
	
	private boolean hasSesameSeeds;
	private double amountOfSoySauce;
	private boolean isSpicy;
	
	public boolean getHasSesameSeeds() {
		return this.hasSesameSeeds;
	}
	
	public void setHasSesameSeeds(boolean hasSesameSeeds) {
		this.hasSesameSeeds = hasSesameSeeds;
	}
	
	public double getAmountOfSoySauce() {
		return this.amountOfSoySauce;
	}
	
	public void setAmountOfSoySauce(double amountOfSoySauce) {
		this.amountOfSoySauce = amountOfSoySauce;
	}
	
	public boolean getIsSpicy() {
		return this.isSpicy;
	}
	
	public void setIsSpicy(boolean isSpicy) {
		this.isSpicy = isSpicy;
	}
	
	@Override //Enforces that the method below is actually overriding a parent method
	public ChineseFood eat() {
		System.out.println("You are eating " + this.getAmount() + " kilograms of " + this.getType() + 
				", I hope you are good at using chopsticks.");
		if(isSpicy) {
			System.out.println("Here's a glass of water, you may need this.");
		}
		this.setAmount(0.0);
		//return "That was really good";
		return this;
	}
	
	public void cook() {
		System.out.println("You are cooking a dish of " + this.getType() + 
				" and it really does smell " + this.getSmell());
		if (hasSesameSeeds) {
			System.out.println("Could you please hand me some Sesame Seeds to finish this.");
		}
	}
	
	//Overloading the cook method, must change number or type of parameters and keep same name
	//to overload a method in Java.
	public Food cook(int numberOfDishes) {
		System.out.println("You are cooking a dish of " + this.getType() + " for " + numberOfDishes + " guests.");
		this.setAmount(this.getAmount() * numberOfDishes);
		//System.out.println("Amount: " + this.getAmount());
		if (this.getAmount() > 20) {
			System.out.println("Boy that is a lot of food!!!");
		}
		return this;
	}
	
	public ChineseFood() {
		
	}
	
	public ChineseFood(boolean hasSesameSeeds, boolean isSpicy, double amountOfSoySauce) {
		this.hasSesameSeeds = hasSesameSeeds;
		this.isSpicy = isSpicy;
		this.amountOfSoySauce = amountOfSoySauce;
	}

}
