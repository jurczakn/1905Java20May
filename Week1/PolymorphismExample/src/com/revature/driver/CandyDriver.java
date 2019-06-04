package com.revature.driver;

import java.io.IOException;

import com.revature.pojo.Candy;
import com.revature.pojo.ChocolateBar;

public class CandyDriver {

	public static void main(String[] args) {
		Candy candy = new Candy();
		ChocolateBar chocolateBar = new ChocolateBar();
		Candy chocolateCandy = new ChocolateBar();
		//System.out.println("Candy contains Nuts: " + candy.containsNuts());
		//System.out.println("Chocolate Bar contains Nuts: " + chocolateBar.containsNuts());
		//System.out.println("Chocolate Candy contains Nuts: " + chocolateCandy.containsNuts());
		//System.out.println(candy.snap());
		chocolateBar.snap();
		//chocolateCandy = candy;
		ChocolateBar cb = (ChocolateBar) chocolateCandy;
		((ChocolateBar)chocolateCandy).snap();
		
		try {
			chocolateCandy.self();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
