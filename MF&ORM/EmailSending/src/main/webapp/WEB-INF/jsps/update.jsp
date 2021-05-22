<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%><!-- Important Tag -->
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/style2.css"
    rel="stylesheet">

<title>SBK - Session</title>
</head>
<body>
<h3>DETAILS</h3>

 
	<table align="center" cellpadding = "10">
	 
	<!----- First Name ---------------------------------------------------------->
	<tr>
	<td>User Id</td>
	<td>
	${userModel.getUserId() }
	</td>
	</tr>
<form:form method = "POST" action = "#" modelAttribute ="userModel" >
	<!----- Last Name ---------------------------------------------------------->
	<tr>
	<td>Password</td>
	<td>
	<form:input path="pwd" maxlength="30"/>
	<form:errors path="pwd" />
	</td>
	</tr>
</form:form>

	<!----- Back Button ------------------------------------------------->
	<tr>
	
	<td colspan="2" align="center">
	<br></br>
	<a href="backPage">
		<button>Back to Form</button>
	</a>
	</td>
	</tr>
	</table>

</body>
</html>