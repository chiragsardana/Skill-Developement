<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%><!-- Important Tag -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/style2.css"
    rel="stylesheet">

<title>SBK - Customer Added Successfully</title>
</head>
<body>
<h3>CUSTOMER REGISTRATION FORM DETAILS</h3>

 
	<table align="center" cellpadding = "10">
	 
	<!----- First Name ---------------------------------------------------------->
	<tr>
	<td>FIRST NAME</td>
	<td>
	${customer.getFirst_Name() }
	</td>
	</tr>
	 
	<!----- Last Name ---------------------------------------------------------->
	<tr>
	<td>LAST NAME</td>
	<td>
	${customer.getLast_Name() }
	</td>
	</tr>
	 
	<!----- Date Of Birth -------------------------------------------------------->
	<tr>
	<td>DATE OF BIRTH</td>
	 
	<td>
	 
	${customer.getBirthday_day() }
	 
	${customer.getBirthday_Month() }
	 
	${customer.getBirthday_Year() }
	</td>
	</tr>
	 
	<!----- Email Id ---------------------------------------------------------->
	<tr>
	<td>EMAIL ID</td>
	<td>
	${customer.getEmail_Id() }
	</td>
	</tr>
	 
	<!----- Mobile Number ---------------------------------------------------------->
	<tr>
	<td>MOBILE NUMBER</td>
	<td>
	${customer.getMobile_Number() }
	</td>
	</tr>
	 
	<!----- Gender ----------------------------------------------------------->
	<tr>
	<td>GENDER</td>
	<td>
	${customer.getGender() }
	</td>
	</tr>
	 
	<!----- Address ---------------------------------------------------------->
	<tr>
	<td>ADDRESS <br /><br /><br /></td>
	<td>
	${customer.getAddress() }
	</td>
	</tr>
	 
	<!----- City ---------------------------------------------------------->
	<tr>
	<td>CITY</td>
	<td>
	${customer.getCity() }
	</td>
	</tr>
	 
	<!----- Pin Code ---------------------------------------------------------->
	<tr>
	<td>PIN CODE</td>
	<td>
	${customer.getPin_Code() }
	</td>
	</tr>
	 
	<!----- State ---------------------------------------------------------->
	<tr>
	<td>STATE</td>
	<td>
	${customer.getState() }
	</td>
	</tr>
	 
	<!----- Country ---------------------------------------------------------->
	<tr>
	<td>COUNTRY</td>
	<td>
	${customer.getCountry() }
	</td>
	</tr>
	 
	<!----- Hobbies ---------------------------------------------------------->
	 
	<tr>
	<td>HOBBIES <br /></td>
	 
	<td>
	${customer.getHobby_Drawing() } 
	${customer.getHobby_Singing() }  
	${customer.getHobby_Dancing() } 
	${customer.getHobby_Cooking() }
	<br />
	</td>
	</tr>
	 
	<!----- Submit and Reset ------------------------------------------------->
	<tr>
	
	<td colspan="2" align="center">
	<br></br>
	<a href="welcome">
		<button>Back to Home</button>
	</a>
	</td>
	</tr>
	</table>

</body>
</html>