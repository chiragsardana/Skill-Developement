<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<H2> Jsp Expressions </H2>
	<UL>
		<LI> Current Time: <%= new java.util.Date() %>
		<LI> Server: <%= application.getServerInfo() %>
		<LI> Sesion Id: <%= session.getId() %>
		<LI> The <CODE>testParam</CODE> from parameter:
		<%= request.getParameter("testParam") %>
	</UL>
</body>
</html>