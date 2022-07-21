package com.laptrinhjavaweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestSql {
	static final String DB_URL = "jdbc:mysql://localhost:3306/javasql2022";
	static final String USER = "root";
	static final String PASS = "101101";

	public static void main(String[] args) {

		System.out.println("Connecting to a selected database...");
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {

			System.out.println("Connected database successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
