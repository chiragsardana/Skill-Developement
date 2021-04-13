<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%><!-- Important Tag -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>    
<html>
<head>
  <link href="resources/css/style.css"
    rel="stylesheet">

	<title>SBK - Login</title>
</head>
<body>
<form:form method = "POST" action = "LoginSuccessfully" modelAttribute ="userModel">
	  <h1>Login</h1>
	  <div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>SBK<span></span></div>
		</div>
		<br>
		<div class="login">
				<form:input path="userId" placeholder="username"/>
				<form:password path="pwd" placeholder="password"/>
				<form:button>Login</form:button>
		</div>
		
</form:form>

</body>
</html>
