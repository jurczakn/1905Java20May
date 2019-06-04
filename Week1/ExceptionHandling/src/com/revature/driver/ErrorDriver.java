package com.revature.driver;

public class ErrorDriver {

	public static void main(String[] args) {

		try {
			//throwsError();
			recur();
		} catch (Error e) {
			System.out.println("Error occurred");
			e.printStackTrace();
		} finally {
			try {
				recur();
			} catch (Error e) {
				System.out.println("Errored again");
				e.printStackTrace();
			}
		}
		System.out.println("Made it");
	}
	
	public static void throwsError() {
		throw new Error();
	}
	
	public static int recur() {
		System.out.println("Inside recur");
		return recur();
	}

}
