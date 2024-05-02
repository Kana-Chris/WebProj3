package com.diworksdev.webproj3.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	
	private static String driverName="org.mariadb.jdbc.Driver";
	
	private static String url="jdbc:mysql://localhost/testdb";
	private static String user = "root";
	private static String password="";
	
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driverName);
			con= DriverManager.getConnection(url,user,password);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
}