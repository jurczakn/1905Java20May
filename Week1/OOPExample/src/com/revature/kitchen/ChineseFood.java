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

}
