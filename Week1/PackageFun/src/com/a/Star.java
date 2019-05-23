package com.a;

public class Star
{
	public static int a; //a.Star, a.Circle, a.Square, b.Circle, c.Triangle, c.Star, d.Star
	protected static int b; //a.Star, a.Circle, a.Square, b.Circle, c.Triangle, c.Star
	static int c; //a.Star, a.Circle, a.Square
	private static int d; //a.Star
	
	public static void main(String[] args)
	{
		int a,b,c,d;
		//com.a.Star
		a=com.a.Star.a;
		b=com.a.Star.b;
		c=com.a.Star.c;
		d=com.a.Star.d;
		
		//com.a.Circle
		a=com.a.Circle.a;
		b=com.a.Circle.b;
		c=com.a.Circle.c;
		d=com.a.Circle.d;
		
		//com.a.Square
		a=com.a.Square.a;
		b=com.a.Square.b;
		c=com.a.Square.c;
		d=com.a.Square.d;
		
		//com.b.Circle
		a=com.b.Circle.a;
		b=com.b.Circle.b;
		c=com.b.Circle.c;
		d=com.b.Circle.d;
		
		//com.c.Triangle
		a=com.c.Triangle.a;
		b=com.c.Triangle.b;
		c=com.c.Triangle.c;
		d=com.c.Triangle.d;
		
		//com.c.Star
		a=com.c.Star.a;
		b=com.c.Star.b;
		c=com.c.Star.c;
		d=com.c.Star.d;
		
		//com.d.Star
		a=com.d.Star.a;
		b=com.d.Star.b;
		c=com.d.Star.c;
		d=com.d.Star.d;
	}
}

class Circle extends com.a.Square{
	public static int a;
	protected static int b;
	static int c;
	private static int d;
	
	public static void main(String[] args)
	{
		int a,b,c,d;
		//com.a.Star
		a=com.a.Star.a;
		b=com.a.Star.b;
		c=com.a.Star.c;
		d=com.a.Star.d;
		
		//com.a.Circle
		a=com.a.Circle.a;
		b=com.a.Circle.b;
		c=com.a.Circle.c;
		d=com.a.Circle.d;
		
		//com.a.Square
		a=com.a.Square.a;
		b=com.a.Square.b;
		c=com.a.Square.c;
		d=com.a.Square.d;
		
		//com.b.Circle
		a=com.b.Circle.a;
		b=com.b.Circle.b;
		c=com.b.Circle.c;
		d=com.b.Circle.d;
		
		//com.c.Triangle
		a=com.c.Triangle.a;
		b=com.c.Triangle.b;
		c=com.c.Triangle.c;
		d=com.c.Triangle.d;
		
		//com.c.Star
		a=com.c.Star.a;
		b=com.c.Star.b;
		c=com.c.Star.c;
		d=com.c.Star.d;
		
		//com.d.Star
		a=com.d.Star.a;
		b=com.d.Star.b;
		c=com.d.Star.c;
		d=com.d.Star.d;
	}
}