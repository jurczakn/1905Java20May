package com.revature.driver;

public class OverloadingExampleDriver {

	public static void main(String[] args) {

		OverloadingExampleDriver oed = new OverloadingExampleDriver();
		System.out.println(" 2 + 2 = " + oed.add(2, 2));
		System.out.println("2.1 + 2.1 = " + oed.add(2.1, 2.1));
		System.out.println("3 + 12 + 25 + 15 + 67 = " + oed.add(3, 12, 25, 15, 67));
		int[] intArr = {2, 5, 165, 74, 23465, 33};
		System.out.println("2 + 5 + 165 + 74 + 23465 + 33 = " + oed.add(intArr));
		oed.add();
		int x = 5;
		int y = 12;
		System.out.println(oed.subtract(y, x));
		//System.out.println(oed.multi(x, y));
		Integer integer = 12;
		integer = new Integer(25);
		Double doub;
		Character character;
		Float floating;
		Boolean bool;
		Short s;
		Byte b;
		Long l;
		//ArrayList<int>
		//Auto boxing--------------------------------VVVVV
		System.out.println("10 / 2 = " + oed.divide(10, 2));
		//Auto unboxing--------------------------------------VVVVVVVVVV
		System.out.println("Integer addition: " + oed.add(new Integer(12), new Integer(16)));
		
		oed.newAdd(1, 1);
		
	}
	
	/*
	 * public int newAdd(int x, int y) { System.out.println("Inside int newAdd");
	 * return x + y; }
	 */
	
	/*
	 * public int newAdd(Integer x, Integer y) { System.out.println("Integer");
	 * return x + y; }
	 */
	
	/*
	 * public double newAdd(double x, double y) { System.out.println("double");
	 * return x + y; }
	 */
	
	
	  public Double newAdd(Double x, Double y) { System.out.println("Double");
	  return x + y; }
	 
	
	
	/*
	 * public int newAdd(int...i) { System.out.println("int var args"); return i[0]
	 * + i[1]; }
	 */
	 
	
	
	/*
	 * public Integer newAdd(Integer...i) { System.out.println("Integer var args");
	 * return i[0] + i[1]; }
	 */
	 
	
	
	
	/*
	 * public double newAdd(double...i) { System.out.println("double var args");
	 * return i[0] + i[1]; }
	 */
	 
	 
	
	public Integer divide(Integer x, Integer y) {
		return x/y;
	}
	
	public short multi(short x, short y) {
		return (short) (x * y);
	}
	
	public long subtract(long y, long x) {
		return y - x;
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public int add(int x, int y, int z) {
		return x + y + z;
	}
	
	//using varagrs or variable length arguments
	// can have 1 per method, must be last param
	public int add(int... i) {
		int ret = 0;
		for(int x : i) {
			ret += x;
		}
		return ret;
	}
	
	//you can change return type when overloading, but you
	//must still change the parameter list as well.
	/*
	 * public double add(int x, int y) { return 4.0; }
	 */
	//changing names of parameters does not work either
	/*
	 * public int add(int a, int b) { return a + b; }
	 */

}
