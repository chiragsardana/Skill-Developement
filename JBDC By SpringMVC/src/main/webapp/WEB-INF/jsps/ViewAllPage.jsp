<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%><!-- Important Tag -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/style2.css"
    rel="stylesheet">

<title>SBK - Customer View Data</title>
</head>
<body>
<h3>CUSTOMER REGISTRATION FORM DETAILS</h3>

 
	<table align="center" cellpadding = "10">
	 
	 <c:forEach items="${listCustomer}" var="customer">
	<!----- First Name ---------------------------------------------------------->
	<tr>
	<td>FIRST NAME: ${customer.getFirst_Name() }&emsp;
	
	
	</td>
	<td>
	LAST NAME: ${customer.getLast_Name() }&emsp;
	</td>
	 <td>
	 EMAIL: ${customer.getEmail_Id() }&emsp;
	 </td>
	 <td>
	 <a href="edit/${customer.getEmail_Id()}">Edit</a>/<a href="delete/${customer.getEmail_Id() }">Delete</a>
	 </td>
	 </c:forEach>
	<!----- Back Button ------------------------------------------------->
	<tr>
	
	<td colspan="2" align="right">
	<br></br>
	<a href="ViewAllData">
		<button>Back to Form</button>
	</a>
	</td>
	</tr>
	</table>

</body>
</html>