package Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Clinet {
	public static void main(String[] args) {

		try {
			Connection c = Test.getConnection();
			String query = "select * from employees where employee_id=?";
			PreparedStatement p = c.prepareStatement(query);
			p.setInt(1, 100);
			ResultSet rs = p.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getInt("employee_id"));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
