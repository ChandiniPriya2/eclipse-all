<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userBean" class="ai.jobiak.model.User" scope="request"></jsp:useBean>
<hr>
First Name:<jsp:setProperty name="userBean" property="fname" param="fname"/><br>
Email:<jsp:setProperty property="email" name="userBean" param="email"/><br>
Mobile:<jsp:setProperty property="mobile" name="userBean" param="mobile"/><br>
</body>
</html>