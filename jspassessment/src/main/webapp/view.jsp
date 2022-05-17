<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userBean" class="ai.jobiak.assess.Contacts" scope="request"></jsp:useBean>
<hr>
First Name:<jsp:getProperty name="userBean" property="fname" /><br>
Mobile:<jsp:getProperty  name="userBean" property="mobile"/><br>

</body>
</html>