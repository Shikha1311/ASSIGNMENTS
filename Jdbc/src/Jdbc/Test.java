package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
	private static final String DB_USERNAME = "postgres";
	private static final String DB_PASSWORD = "12345";
	private static final String DB_URL = "jdbc:postgresql://localhost:5432/hr";
	private static Connection connection = null;
	static {
		try {
			Class.forName("org.postgresql.Driver");
			try {
				connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}
