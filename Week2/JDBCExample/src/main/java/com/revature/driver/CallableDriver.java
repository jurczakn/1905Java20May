package com.revature.driver;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDriver {

	private static String username = "";
	private static String url = "";
	private static String password = "";
	
	public static void main(String[] args) {
		
		try (Connection conn = DriverManager.getConnection(url, username, password)){
			conn.setAutoCommit(false);
			String sql = "{call expensive_tracks_proc(?)}";
			CallableStatement call = conn.prepareCall(sql);
			call.setDouble(1, 0.98);
			ResultSet rsInit = call.executeQuery();
			rsInit.next();
			ResultSet curs = (ResultSet) rsInit.getObject(1);
			while (curs.next()) {
				System.out.println("Name: " + curs.getString(1));
				System.out.println("Unit Price: " + curs.getDouble(2));
			}
			
		} catch (SQLException e) {
			System.out.println("Failed to connect or somthing");
			e.printStackTrace();
		}
		
	}
	
}
