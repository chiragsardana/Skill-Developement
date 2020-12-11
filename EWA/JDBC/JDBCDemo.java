package JDBC;

import java.sql.*;//Step1
import java.util.Scanner;

public class JDBCDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		//Step 2 : Load and Register your Driver
		Class.forName("com.mysql.cj.jdbc.Driver");//Static part only
		//it function to load that class which written inside the forName() method
		
		//Step 3 : Open a database connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","sardana80");
		//Database_URL Username Password URL == Uniform Resource Locator
		
		//Step 4 : Create SQL Statement --> Queuries
		Statement stmt = con.createStatement();
		
		//Insert Data into the Database
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Enter Movie ID : ");
//		int ID = input.nextInt();
//		
//		System.out.println("Enter Movie Name : ");
//		String NAME = input.next();
//		
//		System.out.println("Enter Movie Rating : ");
//		int RATING = input.nextInt();
//		
//		
//		System.out.println("Enter Movie Review : ");
//		String REVIEW = input.next();
//		
//		//Write Insert Query
//		String insert_query = "Insert into movies values ("+ ID + ", '" + NAME + "', " + RATING +", '"+ REVIEW +"')";
//		
//		//for execution of statement
//		int records = stmt.executeUpdate(insert_query);
//		
//		if(records == 1) {
//			System.out.println("Record inserted Succesfully");
//		}else {
//			System.out.println("Insertion Failed!!!!");
//		}
		
		//Write Update Query 
//		String update_query = "update movies set Rating = 9 where ID = 101"; 
//		
//		int no = stmt.executeUpdate(update_query);
//		
//		if(no == 1) {
//			System.out.println("Update Done Successfully");
//		}else {
//			System.out.println("Update Failed!!!");
//		}
//		System.out.println("The Value of Record Update is "+no);
		
		
		//Delete Query
		String delete_query = "delete from movies where ID = 101";
		
		int delete_count = stmt.executeUpdate(delete_query);
		
		System.out.println(delete_count+" row deleted");
		//Step 5 : Execute a Query
		ResultSet rs = stmt.executeQuery("select * from movies");
		
		//Step 6 : Process the Result Treat rs like as an Iterator
		while(rs.next()) {
			//rs.getInt(1);
			int id = rs.getInt("ID");
			String name = rs.getString("Name");
			int rating = rs.getInt(3);
			String review = rs.getString(4);
			
			System.out.println("Movie ID : "+id);
			System.out.println("Movie Name : "+name);
			System.out.println("Movie Rating : "+rating);
			System.out.println("Movie Review : "+review);
		}
		
		//Step 7 : Close Connection 
		rs.close();
		stmt.close();
		con.close();
	}
}
