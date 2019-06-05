package com.revature.driver;

public class DefaultValues {
	
	private   int i;
	
	private   double d;
	
	private   boolean b;
	
	private   byte y;
	
	private   short s;
	
	private   char c;
	
	private   float f;
	
	private   long l;
	
	private   String st;
	
	private   Object o;

	public static void main(String[] args) {
		System.out.println("int " + new DefaultValues().i);
		System.out.println("double " + new DefaultValues().d);
		System.out.println("boolean " + new DefaultValues().b);
		System.out.println("byte " + new DefaultValues().y);
		System.out.println("short " + new DefaultValues().s);
		System.out.println("char " + new DefaultValues().c);
		System.out.println("float " + new DefaultValues().f);
		System.out.println("long " + new DefaultValues().l);
		System.out.println("String " + new DefaultValues().st);
		System.out.println("Object " + new DefaultValues().o);
		int i2;
		//System.out.println("local int: " + i2);
	}

}
