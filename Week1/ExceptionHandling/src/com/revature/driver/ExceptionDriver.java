package com.revature.driver;

import com.revature.exception.MyCustomException;

public class ExceptionDriver {

	public static void main(String[] args) {

		
		//throwsRuntimeException();
		
		try {
			System.out.println("Beginning of try");
			callsThrowsException();
			throwsMyException();
			System.out.println("End of try");
		} catch (Exception e) {
			System.out.println("Something bad happened.");
			//e.printStackTrace();
		} /*
			 * catch (MyCustomException e) { System.out.println("I did something wrong"); }
			 */ finally {
			System.out.println("This will always print");
		}
		
		System.out.println("The end.");
		
		/*
		 * try {
		 * 
		 * }
		 */
		//Every try block must include either a catch and/or a finally block
		try {
			
		} catch (Exception e) {
			
		}
		
		try {
			
		} finally {
			
		}
		
		
		throw new ArithmeticException();
	}

	public static void throwsException() throws Exception {

		/*
		 * if (Math.random() > .5) { throw new Exception("This happened."); }
		 */
		
		if (true) {
			
		} else {
			throw new Exception();
		}
		
	}

	public static void callsThrowsException() throws Exception {
		throwsException();
	}
	
	public static void throwsMyException() throws MyCustomException {
		throw new MyCustomException();
	}
	
	public static void throwsRuntimeException() {
		throw new NullPointerException();
	}

}
