package com.example.model;

public class Person implements Comparable<Person>{

	private String name;

	private int age;

	private boolean clothed;

	private char gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isClothed() {
		return clothed;
	}

	public void setClothed(boolean clothed) {
		this.clothed = clothed;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", clothed=" + clothed + ", gender=" + gender + "] \n";
	}

	public Person(String name, int age, boolean clothed, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.clothed = clothed;
		this.gender = gender;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Person o) {
		return this.getAge() - o.getAge();
	}

}
