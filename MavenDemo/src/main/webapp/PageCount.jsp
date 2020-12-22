<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
			/* Declaration */
			int count = 0;
	
	%>
	<h2> Page count is : </h2><% out.println(count++); %>
</body>
</html>