package com.revature.supplies;

public class MechanicalPencil extends Pencil implements Refillable{
	
	private boolean empty = false;
	
	private int maxCapacity;
	
	private int currentCapacity;
	
	@Override
	public void refill() {
		System.out.println("The pencil is full again.");
		this.empty = false;
		this.currentCapacity = this.maxCapacity;
	}
	
	@Override
	public boolean isEmpty() {
		return empty;
	}
	
	@Override
	public void draw() {
		if(this.empty) {
			System.out.println("Sorry, you are out of lead.");
			return;
		}
		super.draw();
		this.currentCapacity--;
		if(this.currentCapacity<=0) {
			this.empty=true;
		}
		
	}
	
	public MechanicalPencil(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		this.currentCapacity = maxCapacity;
	}
	
}
