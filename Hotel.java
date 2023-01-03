package hotelSql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class Hotel {
	
//	method to read From Table
	public  void readFromTable(){
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
            con = DriverManager.getConnection(url, user,
                    pass);

            // Creating a statement
            Statement st = con.createStatement();
            Scanner scanner=new Scanner(System.in);
            System.out.println("Numbers Of User You Want To Read ");
            int read =scanner.nextInt();
            int count=0;
            String sql="select * from hotel";
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()&&count<=read) {
            	int id=rs.getInt("id");
                 String hotelName=rs.getString("hotelName");
                 String hotelLocation= rs.getString("hotelLocation");
                 Date createdDate= rs.getDate("createdDate");
                 Date updateddDate= rs.getDate("updateddDate");
                 String isActive=rs.getString("isActive");
                 System.out.println(id +" "+hotelName+" "+hotelLocation+" "+createdDate+" "+updateddDate+" " +isActive);
                 count++;
            }}
        catch (Exception ex) {
            System.err.println(ex);
        }	
		}
        
        
        
	
	
//  method to insert values in hotel table
	public void insertIntoTable(){
		
		String url = "jdbc:mysql://localhost:3306/HotelDBMS";

        // Username and password to access DB
        // Custom initialization
        String user = "root";
        String pass = "root";

           // Entering the data
           // Inserting data using SQL query
            Scanner scanner=new Scanner(System.in);
            System.out.println(" Enter The Numbers Of  Rows You Want ");
            Integer rows = scanner.nextInt();
             String hotelName="Shang";
             String hotelLocation="Muscat";
             String createdDate="1996-01-01";
             String updateddDate="2015-01-01";
             boolean isActive=true;
             Random rn = new Random();
             Integer numberToAdd = rn.nextInt(100);
             
             for(int i=0; i<=rows ; i++) {
             String sql = "insert into hotel values ("+i+numberToAdd+", '"+hotelName+i+"', '"+hotelLocation+i+"', '"+
            		 createdDate+"', '"+updateddDate+"', "+isActive+")";

             // Connection class object
             Connection con = null;

             // Try block to check for exceptions
             try {

                 Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                 // Registering drivers
                 DriverManager.registerDriver(driver);

                 // Reference to connection interface
                 con = DriverManager.getConnection(url, user,
                         pass);

 	            // Creating a statement
 	            Statement st = con.createStatement();

 	            // Executing query
 	            int m = st.executeUpdate(sql);
 	            if (m >=0)
 	                System.out.println(
 	                        "inserted values successfully : " + sql);
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
	public void hotelTable() {
		
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
	        String sql = "CREATE TABLE Hotel " + "(id INTEGER PRIMARY KEY, " +" hotelName VARCHAR(8) NOT NULL, "+
	        		"  hotelLocation VARCHAR(8), "+"  createdDate Date NOT NULL, "+"  updateddDate Date, "+
	        		" isActive bit NOT NULL"+ 
	                   ")"; 

	        // Connection class object
	        Connection con = null;

	        // Try block to check for exceptions
	        try {

	            Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	            // Registering drivers
	            DriverManager.registerDriver(driver);

	            // Reference to connection interface
	            con = DriverManager.getConnection(url, user,
	                    pass);

	            // Creating a statement
	            Statement st = con.createStatement();

	            // Executing query
	            int m = st.executeUpdate(sql);
	            if (m >=0)
	                System.out.println(
	                        "inserted successfully : " + sql);
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
