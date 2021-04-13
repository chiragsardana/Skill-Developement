<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%><!-- Important Tag -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>      
<!DOCTYPE html>
<html>
<head>
<link href="resources/css/style2.css"
    rel="stylesheet">
    
<title>SBK - Add Customer</title>
</head>
<body>
<body>

<form:form method = "POST" action = "NewCustomerAdd" modelAttribute ="customerModel">
<h3>CUSTOMER REGISTRATION FORM</h3>

 
	<table align="center" cellpadding = "10">
	 
	<!----- First Name ---------------------------------------------------------->
	<tr>
	<td>FIRST NAME</td>
	<td>
	<form:input path="First_Name" maxlength="30"/>
	(max 30 characters a-z and A-Z)
	</td>
	</tr>
	 
	<!----- Last Name ---------------------------------------------------------->
	<tr>
	<td>LAST NAME</td>
	<td>
	<form:input path="Last_Name" maxlength="30"/>
	(max 30 characters a-z and A-Z)
	</td>
	</tr>
	 
	<!----- Date Of Birth -------------------------------------------------------->
	<tr>
	<td>DATE OF BIRTH</td>
	 
	<td>
	 
	 <form:select path="Birthday_day">
	    <form:option value="-" label="Day"/>
	    <form:options items="${Birthday_dayItems}" />
	</form:select>
	 
	 <form:select path="Birthday_Month">
	    <form:option value="-" label="Month"/>
	    <form:options items="${Birthday_MonthItems}" />
	</form:select>
	 
	<form:select path="Birthday_Year">
	    <form:option value="-" label="Year"/>
	    <form:options items="${Birthday_YearItems}" />
	</form:select>
	</td>
	</tr>
	 
	<!----- Email Id ---------------------------------------------------------->
	<tr>
	<td>EMAIL ID</td>
	<td>
	<form:input path="Email_Id" maxlength="100"/>
	</td>
	</tr>
	 
	<!----- Mobile Number ---------------------------------------------------------->
	<tr>
	<td>MOBILE NUMBER</td>
	<td>
	
	<form:input path="Mobile_Number" maxlength="100"/>
	(10 digit number)
	</td>
	</tr>
	 
	<!----- Gender ----------------------------------------------------------->
	<tr>
	<td>GENDER</td>
	<td>
	Male: <form:radiobutton path="Gender" value="Male"/>
	Female: <form:radiobutton path="Gender" value="Female"/>
	
	</td>
	</tr>
	 
	<!----- Address ---------------------------------------------------------->
	<tr>
	<td>ADDRESS <br /><br /><br /></td>
	<td>
	<form:textarea path="Address" rows="4" cols="30"/>
	</td>
	</tr>
	 
	<!----- City ---------------------------------------------------------->
	<tr>
	<td>CITY</td>
	<td>
	<form:input path="City" maxlength="30"/>
	(max 30 characters a-z and A-Z)
	</td>
	</tr>
	 
	<!----- Pin Code ---------------------------------------------------------->
	<tr>
	<td>PIN CODE</td>
	<td>
	<form:input path="Pin_Code" maxlength="6"/>
	(6 digit number)
	</td>
	</tr>
	 
	<!----- State ---------------------------------------------------------->
	<tr>
	<td>STATE</td>
	<td>
	<form:input path="State" maxlength="30"/>
	(max 30 characters a-z and A-Z)
	</td>
	</tr>
	 
	<!----- Country ---------------------------------------------------------->
	<tr>
	<td>COUNTRY</td>
	<td>
	<form:input path="Country" maxlength="30"/>
	</td>
	</tr>
	 
	<!----- Hobbies ---------------------------------------------------------->
	 
	<tr>
	<td>HOBBIES <br /><br /><br /></td>
	 
	<td>
	Drawing: <form:checkbox path="Hobby_Drawing" value="Drawing"/>
	Singing: <form:checkbox path="Hobby_Singing" value="Singing"/>
	Dancing: <form:checkbox path="Hobby_Dancing" value="Dancing"/>
	Cooking: <form:checkbox path="Hobby_Cooking" value="Cooking"/>
	<br />
	Other: <form:checkbox path="Hobby_Other" value="Other"/>
	<form:input path= "Hobby_Other" maxlength="30"/>
	</td>
	</tr>
	 
	<!----- Submit and Reset ------------------------------------------------->
	<tr>
	<td colspan="2" align="center">
	<form:button>Submit</form:button>
	</td>
	</tr>
	</table>
 
</form:form>
</body>
</html>