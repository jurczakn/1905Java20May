package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.List;

import com.revature.pojo.User;

public class UserDaoImpl implements UserDao {

	private Connection conn;

	@Override
	public void createUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User u) {
		try {
			Statement stmt = conn.createStatement();
			conn.setAutoCommit(false);  //needs to be done to run transactions
			Savepoint sp = conn.setSavepoint("Before Update");
			String query = "update user_table set password = '" + u.getPassword() + "' where username = '" + u.getUsername() + "'";
			int numberOfRows = stmt.executeUpdate(query);
			
			if (numberOfRows > 1) {
				conn.rollback(sp);
				System.out.println("Too many rows affected");
			}
			
			conn.commit();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		

	}

	@Override
	public void preparedUpdateUser(User u){
		try {
			PreparedStatement pstmt = conn.prepareStatement("update user_table set password = ? where username = ?");
			pstmt.setString(1, u.getPassword());
			pstmt.setString(2, u.getUsername());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void deleteUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUserById(Integer id) {
		User ret = null;
		String sql = "select * from user_table where user_id =" + id;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				ret = new User();
				ret.setId(rs.getInt(1));
				ret.setUsername(rs.getString("username"));
				ret.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

}
