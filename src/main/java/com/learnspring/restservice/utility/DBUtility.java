package com.learnspring.restservice.utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {

	private static Connection connection = null;

	public static Connection getConnection() {
		if (connection != null)
			return connection;
		else {
			
			System.out.println("before try================================================================================================================================================================");
			try {
				System.out.println(1 +"================================================================================================================================================================");
				Properties prop = new Properties();
				System.out.println(11 +"================================================================================================================================================================");
				InputStream inputStream = DBUtility.class.getClassLoader()
						.getResourceAsStream("db.properties");
				System.out.println(111 +"================================================================================================================================================================");
				
				prop.load(inputStream);
				String driver = prop.getProperty("driver");
				String url = prop.getProperty("url");
				String user = prop.getProperty("user");
				String password = prop.getProperty("password");
				System.out.println(driver+ "================================================================================================================================================================");
				System.out.println(url+ "================================================================================================================================================================");
				System.out.println(user+ "================================================================================================================================================================");
				System.out.println(password+ "================================================================================================================================================================");
				
				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("ClassNotFoundException================================================================================================================================================================");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("SQLException================================================================================================================================================================");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("FileNotFoundException================================================================================================================================================================");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("IOException================================================================================================================================================================");
			}
			return connection;
		}

	}
}
