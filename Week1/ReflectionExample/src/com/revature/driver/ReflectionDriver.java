package com.revature.driver;

import java.lang.reflect.Field;

public class ReflectionDriver {
	
	public static void main(String[] args) {
		
		String var = "Foo";
		
		System.out.println("Intial contents: " + var);
		
		Class<String> string = String.class;
		
		try {
			Field field = string.getDeclaredField("value");
			field.setAccessible(true);
			field.set(var, "Different".toCharArray());
			System.out.println("New contents: " + var);
			System.out.println("Foo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
