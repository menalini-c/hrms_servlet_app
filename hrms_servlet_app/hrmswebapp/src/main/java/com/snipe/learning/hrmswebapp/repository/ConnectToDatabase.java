package com.snipe.learning.hrmswebapp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.snipe.learning.hrmswebapp.constants.IConstants;


public class ConnectToDatabase {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(IConstants.DB_DRIVER);
		return DriverManager.getConnection(IConstants.DB_URL,IConstants.DB_USER_NAME,IConstants.DB_PASSWORD);
	}
}
