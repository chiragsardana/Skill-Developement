<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%><!-- Important Tag -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>    
<html>
<head>
  <link href="resources/css/style2.css"
    rel="stylesheet">

	<title>SBK - Sign Up</title>
	
	<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="HandheldFriendly" content="true">
</head>
<body>
<form:form method = "POST" action = "SignUpSuccessfully" modelAttribute ="signUpModel">
	  <h1>Login</h1>
	  <div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>SBK</div>
		</div>
		<br>
		<div class="login">
				<br>
				<form:input path="firstName" placeholder="first name"/>
				<form:errors path="firstName" />
				<br>
				<br>
				<form:input path="lastName" placeholder="last Name"/>
				<form:errors path="lastName" />
				<br>
				<br>
				<form:input path="userId" placeholder="username"/>
				<form:errors path="userId" />
				<br>
				<form:password path="pwd" placeholder="password"/>
				<form:errors path="pwd" />
				<br>
				<form:button>Login</form:button>
		</div>
		
</form:form>

</body>
</html>
