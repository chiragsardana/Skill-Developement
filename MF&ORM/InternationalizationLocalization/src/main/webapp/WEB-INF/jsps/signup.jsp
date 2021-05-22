<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%><!-- Important Tag -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
<div class="topright">
<a id="en" href="/InternationalizationLocalization/LoginSuccessfully?lang=en">English</a> | <a id="hi" href="/InternationalizationLocalization/LoginSuccessfully?lang=fr">French</a>
</div>
<form:form method = "POST" action = "SignUpSuccessfully" modelAttribute ="signUpModel">
	  <h1>Login</h1>
	  <div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div><a id="en" href="/InternationalizationLocalization/signup?lang=en">English</a> | <a id="hi" href="/InternationalizationLocalization/signup?lang=fr">French</a></div>
		</div>
		<br>
		<div class="login">
				<br>
				
				<spring:message code="userId" var="userId" />
				<spring:message code="firstName" var="firstName" />
				<spring:message code="lastName" var="lastName" />
				<spring:message code="pwd" var="pwd" />
				<form:input path="firstName" placeholder="${firstName}"/>
				<form:errors path="firstName" />
				<br>
				<br>
				<form:input path="lastName" placeholder="${lastName}"/>
				<form:errors path="lastName" />
				<br>
				<br>
				<form:input path="userId" placeholder="${userId}"/>
				<form:errors path="userId" />
				<br>
				<form:password path="pwd" placeholder="${pwd}"/>
				<form:errors path="pwd" />
				<br>
				<form:button>Login</form:button>
		</div>
		
</form:form>

</body>
</html>
