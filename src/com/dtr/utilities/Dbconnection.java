package com.dtr.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
	
	final static String dbDriver = "com.mysql.cj.jdbc.Driver";
	final static String dbURL = "jdbc:mysql://localhost:3306/drivetrackerjune?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	final static String dbUsername = "root";
	final static String dbPassword = "root";
	
	public static Connection getConnection() 
	{
		
		Connection con=null;
	try {
		Class.forName(dbDriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		try {
			con=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	
		
	}


}
