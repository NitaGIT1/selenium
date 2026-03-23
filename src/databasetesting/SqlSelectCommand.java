package databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlSelectCommand {

	public static void main(String[] args) throws SQLException {

		String dbUrl = "jdbc:mysql://localhost:3306/emp1";

		String username = "root";

		String password = "password";

		String query1 = "SELECT * FROM employee";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		Connection con = DriverManager.getConnection(dbUrl, username, password);

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery(query1);

		while (rs.next()) {
			String myName = rs.getString(1);
			int myAge = rs.getInt(2);

			System.out.println(myName + " " + myAge);
		}
		rs.close();
		stmt.close();
		con.close();
	}
}
