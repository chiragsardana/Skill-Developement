<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%><!-- Important Tag -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>    
<html>
<head>
  <link href="resources/css/style.css"
    rel="stylesheet">

	<title>SBK - Email Sended ${userModel.getUserId() }</title>
	
	<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="HandheldFriendly" content="true">
</head>
<body>
	  <div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>${userModel.getUserId() }</div>
		</div>
		<br>
		<div class="emailSended">
				Mail Send to 
				<br>
				<br>
				${email.getMailTo() }
				<br>
				
				<br>
				
				Successfully!!!
		</div>
		

</body>
</html>
