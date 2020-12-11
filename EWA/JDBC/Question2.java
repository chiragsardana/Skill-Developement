package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step 2 : Load and Register your Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//Step 3 : Open a database connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","sardana80");
		con.setAutoCommit(false);
		
		//Step 4 : Create SQL Statement --> Queuries
		Statement stmt = con.createStatement();		
		
		//Insert Data into the Database
		Scanner input = new Scanner(System.in);
						
		System.out.println("Enter Book ID : ");
		int ID = input.nextInt();
		input.nextLine();
		System.out.println("Enter Book Title : ");
		String TITLE = input.nextLine();
					
		System.out.println("Enter Book Author : ");
		String AUTHOR = input.nextLine();
						
						
		System.out.println("Enter Book Price : ");
		float PRICE= input.nextFloat();
				
		System.out.println("Enter Book Quantity : ");
		int QUANTITY = input.nextInt();
		//Write Insert Query
		String insert_query = "Insert into books values ("+ ID + ", '" + TITLE + "', '" + AUTHOR +"', "+ PRICE +", "+QUANTITY+")";
				
		//insert into movies values ( 101, 'Amazon India', 'Amazon', 99.0, 1);
				
		stmt.executeUpdate(insert_query);
		
		con.rollback();
		
		//Step 5 : Execute a Query
		ResultSet rs = stmt.executeQuery("select * from books");
		
		System.out.println("The Table when AutoCommit is Disable");
		
		//Showing The Table
		while(rs.next()) {
			//rs.getInt(1);
			int id = rs.getInt("id");
			String title = rs.getString("title");
			String author = rs.getString(3);
			float price = rs.getFloat(4);
			int quantity = rs.getInt(5);
					
			System.out.println("Book ID : "+id);
			System.out.println("Book Title : "+title);
			System.out.println("Book Author : "+author);
			System.out.println("Book Price : "+price);
			System.out.println("Book Quantity : "+quantity);
		}
		
		System.out.println("Enter Book ID : ");
		ID = input.nextInt();
		input.nextLine();
		System.out.println("Enter Book Title : ");
		TITLE = input.nextLine();
					
		System.out.println("Enter Book Author : ");
		AUTHOR = input.nextLine();
						
						
		System.out.println("Enter Book Price : ");
		PRICE= input.nextFloat();
				
		System.out.println("Enter Book Quantity : ");
		QUANTITY = input.nextInt();
		//Write Insert Query
		insert_query = "Insert into books values ("+ ID + ", '" + TITLE + "', '" + AUTHOR +"', "+ PRICE +", "+QUANTITY+")";
				
		//insert into movies values ( 101, 'Amazon India', 'Amazon', 99.0, 1);
				
		stmt.executeUpdate(insert_query);
		//Manually Commit
		con.commit();
		
		
		//Roll Back
		con.rollback();
		
		rs = stmt.executeQuery("select * from books");
		
		System.out.println("The Table when Manually Commit");
		
		//Showing The Table
		while(rs.next()) {
			//rs.getInt(1);
			int id = rs.getInt("id");
			String title = rs.getString("title");
			String author = rs.getString(3);
			float price = rs.getFloat(4);
			int quantity = rs.getInt(5);
					
			System.out.println("Book ID : "+id);
			System.out.println("Book Title : "+title);
			System.out.println("Book Author : "+author);
			System.out.println("Book Price : "+price);
			System.out.println("Book Quantity : "+quantity);
		}
		
		
				
	}

}
