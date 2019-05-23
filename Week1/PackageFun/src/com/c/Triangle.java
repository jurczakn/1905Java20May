package com.c;

public class Triangle extends com.b.Circle{
	public static int a;
	protected static int b;
	static int c;
	private static int d;
	
	public static void main(String[] args)
	{
		int a,b,c,d;
		//com.a.Star
		a=com.a.Star.a;
		b=com.a.Star.b; //inherits
		c=com.a.Star.c; //not same package
		d=com.a.Star.d;	//private
		
		//cannot see com.a.Circle
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

class Star extends com.c.Triangle{
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
