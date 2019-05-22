package com.revature.main;

import com.revature.kitchen.ChineseFood;
import com.revature.kitchen.Food;

public class PolymorphismDemo {
	
	public static void main(String[] args) {
		Food food = new Food("Italian", "Yellowish", "amazing", 3.0, 3.0);
		food.eat();
		ChineseFood food2 = new ChineseFood();
		food2.setType("Ramen");
		food2.setAmount(5.0);
		food2.setIsSpicy(true);
		food2.cook();
		food2.cook(10);
		food2.eat();
		ChineseFood result = food2.eat();
		
		
		//Dynamic Binding
		Food food3 = new MexicanFood();
		food3.setType("Nigerian");
		food3.setAmount(9980.0);
		food3.eat();
		//food3.cook();
		//((ChineseFood)food3).cook();
		//food3.cook();
	}

}
