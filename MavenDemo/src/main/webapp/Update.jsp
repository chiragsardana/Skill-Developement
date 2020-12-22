<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>

<FORM action="Update.jsp" method="get">
			<table style="with: 50%">
				<tr>
					<td>Student Id</td>
					<td><input type="text" name="Id" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
					<tr>
					<td>Department</td>
					<td><input type="text" name="department" /></td>
				</tr>
				</table>
			<input type="submit" value="Submit" /></form>

<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %>

<%
try {
	 String name = request.getParameter("name");
	   Integer id =Integer.parseInt(request.getParameter("Id"));
	   String department = request.getParameter("department");
	Class.forName("com.mysql.cj.jdbc.Driver");
     
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","sardana80");
 
	String query = "update Student Set name='"+name+"',department ='"+department+"' where id = "+id;

	Statement stmt = con.createStatement();
    
    int record = stmt.executeUpdate(query);
	
	if(record == 1) {
		System.out.println("Updated Successfully!!!");
		out.println("<h2>Record Updated Successfully</h2>");
	}else {
		System.out.println("There is some error!!!!");
	}
}catch(Exception e) {
	e.printStackTrace();
}
%>

</body>
</html>