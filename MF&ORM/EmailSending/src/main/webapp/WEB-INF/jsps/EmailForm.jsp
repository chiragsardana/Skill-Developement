<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%><!-- Important Tag -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<html>
<head>
  <link href="resources/css/style.css"
    rel="stylesheet">

	<title>SBK - Email ${userModel.getUserId() }</title>
	
	<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="HandheldFriendly" content="true">
</head>
<body>

<form:form method = "POST" action = "emailSend" modelAttribute ="emailModel">
	  <div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>${userModel.getUserId() }</div>
		</div>
		<br>
		<div class="login">
				<form:input path="mailTo" placeholder="To..."/>
				<form:errors path="mailTo" />
				<br>
				<br>
				<form:input path="subject" placeholder="Subject of Mail"/>
				<form:errors path="subject" />
				<br>
				<br>
				<form:input path="message" placeholder="Message"/>
				<form:errors path="message" />
				<br>
				<br>
				<form:input path="fileName" size="60" placeholder="Select File" type = "file"/>
				<br>
				<br>
				<form:button>Send</form:button>
		</div>
		
</form:form>

</body>
</html>
