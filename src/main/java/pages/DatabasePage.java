package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String sqlUlr = "JDBC:mysql://44.195.13.80:3306/june_2023";
	String sqlUsername = "student";
	String sqlPassword = "Student@123";
	String sqlQuery = "SELECT * FROM login_data";
	String columnValue;

	public String getDataFromDatabase(String columnName) {

		try {
			// Set properties for MySql
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create a connection to the database
			connection = DriverManager.getConnection(sqlUlr, sqlUsername, sqlPassword);

			// Empower connection reference variable to execute queries
			statement = connection.createStatement();

			// Execute the query.
			resultSet = statement.executeQuery(sqlQuery);

			while (resultSet.next()) {
				columnValue = resultSet.getString(columnName);
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		return columnValue;
	}

}
