package com.revature.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDriver {
	
	private static String username = "";
	private static String url = "";
	private static String password = "";

	public static void main(String[] args) {
		
		
		try (Connection conn = DriverManager.getConnection(url, username, password);) {
			
			System.out.println("Worked!!!!");
			
			
			  String sql2 = "create table bounce_house (" +
					  "bounce_house_id serial primary key," 
					  + "air boolean," +
					  "people integer" +
					  ")";
			 
					
			String sql = "insert into bounce_house values(1, true, 19)";
			
			Statement stmt = conn.createStatement();
			
			int numberOfRows = stmt.executeUpdate(sql);
			System.out.println(numberOfRows);
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Failed!!!!! :(");
		}
		
	}

}
