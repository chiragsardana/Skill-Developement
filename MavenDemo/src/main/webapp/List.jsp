<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %>

<%
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	 
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","sardana80");
 
	Statement stmt = con.createStatement();
	
	String query = "select * from Student";
	ResultSet rs = stmt.executeQuery(query);
	out.print("<table border='1' width='100%'");  
    out.print("<tr><th>Id</th>"
    			+ "<th>Name</th>"
    			+ "<th>Department</th>"
    		+ "</tr>");
	while(rs.next()) {
		 out.print("<tr>"
		 				+"<td>"+rs.getInt(1)+"</td>"
		 				+"<td>"+rs.getString(2)+"</td>"
		 				+"<td>"+rs.getString(3)+"</td>"
		 			+"</tr>");      	        
	}

}catch(ClassNotFoundException e) {
e.printStackTrace();
} catch (SQLException e) {
e.printStackTrace();
} %>
</body>
</html>