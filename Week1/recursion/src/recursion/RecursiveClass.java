package recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursiveClass {
	static int x=0;
	//No Recursion
	public int method1() {
		return 3;
	}
	
	//Linear Recursion
	public int method2(int x) {
		if(x>4) {
			return method6(3,x);
		}else {
			return 5;
		}
	}
	
	//Tail Recursion
	public int method3(int x, int y) {
		System.out.println("inside method 3 with x="+x+" and y= "+y);
		if(x>y) {
			return 5;
		}else {
			return method2(y);
		}
	}
	//Binary Recursion
	public int method4(int x) {
		if(x<4) {
			return method4(x+1);
		}else if(x>10){
			return method4(x-1);
		}else {
			return 5;
		}
	}

	
	//Exponential screw up
	public int method5(List<String> listy) {
		String str = new String();
		List<String> stringy = new ArrayList<>();
		for(String temp:listy) {
			str.concat(temp);
			System.out.print(temp);
			
		}
		x++;
		System.out.println(x);
		System.out.println(str);
		stringy.add(str);
		System.out.println(stringy);
		return method5(stringy);
	}
	
	//nested recursion then mutual
	public int method6(int x, int y){
		System.out.println("inside method 6 with x="+x+" and y= "+y);
		if(x>=y) {
			return 5;
		}else {
			return method6(method3(y,x),x);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		RecursiveClass rc = new RecursiveClass();
		List<String> str = new ArrayList<>();

		str.add("hello");
		str.add("bag");
		str.add("goodbye");
//		rc.method5(str);
		rc.method6(25,40);
	}
	
	
	
	
	
	
}
