package hotelSql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Room {

	public void roomTable() {

		// Java Program to Establish Connection in JDBC

		// Main class

		// Main driver method

		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String url = "jdbc:mysql://localhost:3306/HotelDBMS";

		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";

		// Entering the data
		Scanner scanner = new Scanner(System.in);
		String sql = "CREATE TABLE Room " + "(id INTEGER PRIMARY KEY, " + " room_Type_id INTEGER,"
				+ " FOREIGN KEY (room_Type_id) REFERENCES RoomType (id)ON DELETE CASCADE, " + " Hotel_id INTEGER, "
				+ " FOREIGN KEY (Hotel_id) REFERENCES Hotel (id) ON DELETE CASCADE,  "
				+ "  created_Date Date NOT NULL, " + "  updated_dDate Date, " + " isActive Boolean NOT NULL" + ")";

		// Connection class object
		Connection con = null;

		// Try block to check for exceptions
		try {

			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			// Creating a statement
			Statement st = con.createStatement();

			// Executing query
			int m = st.executeUpdate(sql);
			if (m >= 0)
				System.out.println("inserted successfully : " + sql);
			else
				System.out.println("insertion failed");

			// Closing the connections
			con.close();
		}

		// Catch block to handle exceptions
		catch (Exception ex) {
			// Display message when exceptions occurs
			System.err.println(ex);
		}

	}
}
