package hotelSql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class Employee {

//	method to update value in one column
	public void makeIsActiveFalseById() {
		String url = "jdbc:mysql://localhost:3306/HotelDBMS";

		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";
		Connection con = null;

		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			// Creating a statement
			Statement st = con.createStatement();
			Scanner scanner = new Scanner(System.in);

			System.out.println("Number Of Id You Want To Update (is avtive column)");
			int inputid = scanner.nextInt();
//      int count=1;

			String sql = "UPDATE employees SET is_Active='0' WHERE id='" + inputid + "'";
			System.out.println(sql);

			try {
				// Executing query
				int m = st.executeUpdate(sql);
				System.out.println("UPDATED SUCCESSFULLY");
			} catch (Exception ex) {
				System.err.println(ex);
			}
			// Closing the connections
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}

//	method to delete values by Id
	public void deleteById() {
		String url = "jdbc:mysql://localhost:3306/HotelDBMS";

		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";
		Connection con = null;

		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			// Creating a statement
			Statement st = con.createStatement();
			Scanner scanner = new Scanner(System.in);

			System.out.println("Number Of Id You Want To Delete ");
			int inputid = scanner.nextInt();
//      int count=1;

			String sql = "delete from employees where id ='" + inputid + "'";

			System.out.println(sql);

			try {
				// Executing query
				int m = st.executeUpdate(sql);
				System.out.println("UPDATED SUCCESSFULLY");
			} catch (Exception ex) {
				System.err.println(ex);
			}
			// Closing the connections
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}

//	method to update values by Id
	public void updateById() {
		String url = "jdbc:mysql://localhost:3306/HotelDBMS";

		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";
		Connection con = null;

		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			// Creating a statement
			Statement st = con.createStatement();
			Scanner scanner = new Scanner(System.in);

			System.out.println("Number Of Id You Want To Update ");
			int inputid = scanner.nextInt();
//      int count=1;
			System.out.println("Enter created Date: ");
			String created_Date = scanner.next();
			System.out.println("Enter updated Date: ");
			String updated_Date = scanner.next();
			String sql = "UPDATE employees SET created_Date='" + created_Date + "',updated_Date='" + updated_Date
					+ "' WHERE id=" + inputid;
			System.out.println(sql);

			try {
				// Executing query
				int m = st.executeUpdate(sql);
				System.out.println("UPDATED SUCCESSFULLY");
			} catch (Exception ex) {
				System.err.println(ex);
			}
			// Closing the connections
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}

//	method to read From Table by Id
	public void getById() {
		String url = "jdbc:mysql://localhost:3306/HotelDBMS";

		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";
		Connection con = null;
		try {

			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			// Creating a statement
			Statement st = con.createStatement();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Numbers Of Id You Want To Show ");
			int inputid = scanner.nextInt();
			int count = 1;
			String sql = "select * from employees where id='" + inputid + "'";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next() && count <= inputid) {
				int id = rs.getInt("id");
				String employee_Type_id = rs.getString("employee_Type_id");
				String Room_id = rs.getString("Room_id");
				Date created_Date = rs.getDate("created_Date");
				Date updated_Date = rs.getDate("updated_Date");
				String is_Active = rs.getString("is_Active");
				System.out.println(id + " " + employee_Type_id + " " + Room_id + " " + created_Date + " " + updated_Date
						+ " " + is_Active);
				count++;
			}
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}

//	method to read From Table
	public void readFromTable() {
		String url = "jdbc:mysql://localhost:3306/HotelDBMS";

		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";
		Connection con = null;
		try {

			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			// Creating a statement
			Statement st = con.createStatement();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Numbers Of User You Want To Read ");
			int read = scanner.nextInt();
			int count = 1;
			String sql = "select * from employees";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next() && count <= read) {
				int id = rs.getInt("id");
				String employee_Type_id = rs.getString("employee_Type_id");
				String Room_id = rs.getString("Room_id");
				Date created_Date = rs.getDate("created_Date");
				Date updated_Date = rs.getDate("updated_Date");
				String isActive = rs.getString("isActive");
				System.out.println(id + " " + employee_Type_id + " " + Room_id + " " + created_Date + " " + updated_Date
						+ " " + isActive);
				count++;
			}
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}

//  method to insert values in table
	public void insertIntoTable() {

		String url = "jdbc:mysql://localhost:3306/HotelDBMS";

		// Username and password to access DB
		// Custom initialization
		String user = "root";
		String pass = "root";

		// Entering the data
		// Inserting data using SQL query
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter The Numbers Of  Rows You Want ");
		Integer rows = scanner.nextInt();
		String employee_Type_id = "manager";
		String Room_id = "123";
		String created_Date = "1996-01-01";
		String updated_Date = "2015-01-01";
		boolean is_Active = true;
		Random rn = new Random();
		Integer numberToAdd = rn.nextInt(100);

		for (int i = 0; i <= rows; i++) {
			String sql = "insert into employees values (" + i + numberToAdd + ", '" + employee_Type_id + i + "', '"
					+ Room_id + i + "', '" + created_Date + "', '" + updated_Date + "', " + is_Active + ")";

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
					System.out.println("inserted values successfully : " + sql);
				else
					System.out.println("insertion values failed");

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

//  method to create hotel table
	public void employeeTable() {

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

//	        String sql = "CREATE TABLE Employees "+
//	        
//	        "(id INTEGER ,"+
//	        "employee_Type_id INTEGER REFERENCES EmployeeType (id)," +
//	        
//	        	"Room_id INTEGER REFERENCES Hotel (id),"+ 
//	        	  "created_Date Date NOT NULL,"+
//	              "updated_Date Date, "+
//	        	  "is_Active Boolean NOT NULL,"+ 
//	              "PRIMARY KEY (id))";

		String sql = "CREATE TABLE Employees (id INTEGER , employee_Type_id INTEGER REFERENCES EmployeeType (id), "
				+ " Room_id INTEGER " + " REFERENCES Rooms (id),  " + "  created_Date Date NOT NULL, "
				+ "  updated_Date Date, " + " is_Active Boolean NOT NULL, " + "PRIMARY KEY (id) " + ")";

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
