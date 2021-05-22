<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%><!-- Important Tag -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>      
<!DOCTYPE html>
<html>
<head>
<link href="../resources/css/style2.css"
    rel="stylesheet">

<title>SBK - Edit Customer</title>
</head>
<body>
<body>

<form:form method = "POST" action = "submit" modelAttribute ="customerModel" >
<h3>CUSTOMER REGISTRATION DETAILS EDIT</h3>

 
	<table align="center" cellpadding = "10">
	 
	<!----- First Name ---------------------------------------------------------->
	<tr>
	<td>FIRST NAME</td>
	<td>
	<form:input path="First_Name" maxlength="30"/>
	<form:errors path="First_Name" />
	</td>
	</tr>
	 
	<!----- Last Name ---------------------------------------------------------->
	<tr>
	<td>LAST NAME</td>
	<td>
	<form:input path="Last_Name" maxlength="30"/>
	<form:errors path="Last_Name" />
	</td>
	</tr>
	 
	<!----- Date Of Birth -------------------------------------------------------->
	<tr>
	<td>DATE OF BIRTH</td>
	 
	<td>
	 
	 <form:select path="Birthday_day">
	    <form:option value="" label="Day"/>
	    <form:options items="${customerModel.getBirthday_dayItems() }" />
	    <form:errors path="Birthday_day" />
	</form:select>
	 
	 <form:select path="Birthday_Month">
	    <form:option value="" label="Month"/>
	    <form:options items="${customerModel.getBirthday_MonthItems() }" />
	    <form:errors path="Birthday_Month" />
	</form:select>
	 
	<form:select path="Birthday_Year">
	    <form:option value="" label="Year"/>
	    <form:options items="${customerModel.getBirthday_YearItems() }" />
	    <br>
	    <form:errors path="Birthday_Year" />
	    <br>
	</form:select>
	</td>
	</tr>
	 
	<!----- Email Id ---------------------------------------------------------->
	<tr>
	<td>EMAIL ID</td>
	<td>
	<form:input path="Email_Id" maxlength="100"  readonly="true"/>
	<form:errors path="Email_Id" />
	</td>
	</tr>
	 
	<!----- Mobile Number ---------------------------------------------------------->
	<tr>
	<td>MOBILE NUMBER</td>
	<td>
	
	<form:input path="Mobile_Number" maxlength="10"/>
	<form:errors path="Mobile_Number" />
	</td>
	</tr>
	 
	<!----- Gender ----------------------------------------------------------->
	<tr>
	<td>GENDER</td>
	<td>
	Male: <form:radiobutton path="Gender" value="M"/>
	Female: <form:radiobutton path="Gender" value="F"/>
	<form:errors path="Gender" />
	</td>
	</tr>
	 
	<!----- Address ---------------------------------------------------------->
	<tr>
	<td>ADDRESS <br /><br /><br /></td>
	<td>
	<form:textarea path="Address" rows="4" cols="30"/>
	<form:errors path="Address" />
	</td>
	</tr>
	 
	<!----- City ---------------------------------------------------------->
	<tr>
	<td>CITY</td>
	<td>
	<form:input path="City" maxlength="30"/>
	<form:errors path="City" />
	</td>
	</tr>
	 
	<!----- Pin Code ---------------------------------------------------------->
	<tr>
	<td>PIN CODE</td>
	<td>
	<form:input path="Pin_Code" maxlength="6"/>
	<form:errors path="Pin_Code" />
	</td>
	</tr>
	 
	<!----- State ---------------------------------------------------------->
	<tr>
	<td>STATE</td>
	<td>
	<form:input path="State" maxlength="30"/>
	<form:errors path="State" />
	</td>
	</tr>
	 
	<!----- Country ---------------------------------------------------------->
	<tr>
	<td>COUNTRY</td>
	<td>
	<form:input path="Country" maxlength="30"/>
	<form:errors path="Country" />
	</td>
	</tr>
	 
	<!-----Course ID ---------------------------------------------------------->
	 
	<tr>
	<td>COURSE ID</td>
	 
	<td>
	<form:input path= "Course_Id"/>
	<form:errors path="Course_Id" />
	</td>
	</tr>
	
	<!-----Course ID ---------------------------------------------------------->
	 
	<tr>
	<td>ENROLEMENT KEY</td>
	 
	<td>
	<form:input path= "Enrolement_Id"/>
	<form:errors path="Enrolement_Id" />
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