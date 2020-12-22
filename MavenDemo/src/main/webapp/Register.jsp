<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<FORM action="Register.jsp" method="get">
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
	    String name = request.getParameter("name");
	   String id = request.getParameter("Id");
	   String department = request.getParameter("department");
	   try {
	   		Class.forName("com.mysql.cj.jdbc.Driver");
	        
	   		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","sardana80");
	        
	   		
	   		out.println("</body></html>");
	        
	        String insert_query = "insert into Student values ("+id+", '"+name+"', '"+department+"')";
	     
	        Statement stmt = con.createStatement();
	        
	        int record = stmt.executeUpdate(insert_query);
	        
	        if(record == 1) {
	       	 	out.println("<h2>Record Inserted Successfully</h2>");
	        }else {
	       	 out.println("<h2>Error in saving the record!!<h2>");
	        }
	        
	        out.println("</body></html>");
	        /* System.out.println(id); */
	   }catch(Exception e){
		   System.out.println(e);
	   }finally{
		   /* out.close(); */
	   }
	   
	   %>

</body>
</html>