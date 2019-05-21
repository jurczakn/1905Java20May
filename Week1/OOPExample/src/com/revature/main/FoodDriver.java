package com.revature.main;

import com.revature.kitchen.Food;
import com.revature.kitchen.ChineseFood;

public class FoodDriver {

	public static void main(String[] args) {
		Food food = new Food();
		food.setType("fruit");
		food.setColor("red");
		food.setCost(1.0);
		
		Food chineseFood = new ChineseFood();
		
		chineseFood.setIsSpicy(true);
		
		chineseFood.setHasSesameSeeds(false);
		
		printFood(chineseFood);
		
		printFood(food);
		
		Food food2 = new Food("Mexican", "brown", "great", 10.0, 25.0);
		
		ChineseFood chineseFood2 = new Food("Chinese", "white/orange", "amazing", 15.0, 6050.0);
		
		printFood(food2);
	}
	
	public static void printFood(Food food) {
		System.out.println("Type: " + food.getType());
		System.out.println("Color: " + food.getColor());
		System.out.println("Smell " + food.getSmell());
		System.out.println("Cost: " + food.getCost());
		System.out.println("Amount: " + food.getAmount());
	}
	
}
