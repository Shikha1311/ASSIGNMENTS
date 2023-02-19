package Jdbc;

import java.sql.Connection;

public class DbUtil {
	public static void main(String[] args) {
		Connection c = Test.getConnection();
		if (c != null)
			System.out.println("Yes");
		else
			System.out.println("no");
	}

}
