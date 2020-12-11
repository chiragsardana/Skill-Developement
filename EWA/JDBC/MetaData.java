package JDBC;

import java.sql.*;
@SuppressWarnings("unused")
public class MetaData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//Step 2 : load & register he driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 3 : Establish a Database Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","sardana80");
		
		//Step 4 : Obtain DataBase Information
		DatabaseMetaData metData = con.getMetaData();
		
		System.out.println("==== DataBase ====");
		
		System.out.println("DataBase Product Name is : "+metData.getDatabaseProductName());
		
		System.out.println("DataBase Product Version : "+metData.getDatabaseProductVersion());
		
		System.out.println("Major Version : "+metData.getDatabaseMajorVersion());
		
		System.out.println("Driver Name : "+metData.getDriverName());
		
		System.out.println("Driver Version : "+metData.getDriverVersion());
		
		//Step 5 : Obtain Table Information
		String catalog = null;
		String schemaPattern = null;
		String tableNamePattern = null;
		String[] types = {"SYSTEM TABLE"};
		ResultSet rs = metData.getTables(catalog, schemaPattern, tableNamePattern, types);
		
		System.out.println("Table Information!!! ");
		
		while(rs.next()) {
			String tableName = rs.getString("table_name");
			System.out.println(tableName);
		}
		
		rs = metData.getColumns(catalog, schemaPattern, "movies", null);
		
		System.out.println("==== Column Information ====");
		
		while(rs.next()) {
			System.out.println("Column Name is : "+rs.getString("column_name"));
			System.out.println("Column Type is : "+rs.getString("data_type"));
			System.out.println("Column Size is : "+rs.getString("column_size"));
		}
	}

}
