<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>
<%@ include file= "header.jsp"%>
</h2>
<h3>
<jsp:include page="caluculator.jsp"></jsp:include>  
</h3>
<h2>
<%@ include file= "footer.jsp"%>  
</h2>
</body>
</html>