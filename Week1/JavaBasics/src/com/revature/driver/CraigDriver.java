package com.revature.driver;

import com.revature.pojo.Person;

public class CraigDriver {

	public static void main(String[] args) {

		Person craig = new Person();
		
		craig.setAge(25);
		System.out.println("Age before birthday: " + craig.getAge());
		haveBirthday(craig);
		System.out.println("Age after birthday: " + craig.getAge());
		
	}
	
	private static void haveBirthday(Person p) {
		p.setAge(p.getAge() + 1);
	}

}
