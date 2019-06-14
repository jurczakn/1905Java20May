package com.revature.driver;

import java.util.Scanner;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.pojo.User;
import com.revature.util.ConnectionFactory;

public class PreparedDriver {

	private static UserDao userDao = new UserDaoImpl(ConnectionFactory.getConnection());

	public static void main(String[] args) {
		System.out.println("Do you wish to change your password?");

		Scanner sc = new Scanner(System.in);
		if ("yes".equals(sc.nextLine().toLowerCase())) {
			/*
			 * System.out.println("Please enter your id"); Integer id = sc.nextInt();
			 * sc.nextLine();
			 */
			System.out.println("Please enter new username");
			String username = sc.nextLine();
			System.out.println("Please enter new password");
			String password = sc.nextLine();
			userDao.updateUser(new User(-1, username, password));
			//userDao.preparedUpdateUser(new User(-1, username, password));
		}

	}

}
