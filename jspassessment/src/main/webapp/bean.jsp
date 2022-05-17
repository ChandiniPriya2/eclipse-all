<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userBean" class="ai.jobiak.assess.Contacts"></jsp:useBean>
<jsp:setProperty name="userBean" property="fname" param="fname"/>
<jsp:setProperty name="userBean" property="mobile" param="mobile"/>
<jsp:forward page= "view.jsp"></jsp:forward>
</body>
</html>