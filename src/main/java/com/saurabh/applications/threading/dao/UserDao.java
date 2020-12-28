package com.saurabh.applications.threading.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDao {

	public static Connection getConnection() throws ClassNotFoundException {
		Connection connection = null;
		Class.forName("org.sqlite.JDBC");
		connection = DriverManager.getConnection("jdbc:sqlite:sample.db")
		
		
	}
}
