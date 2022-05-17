<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Enter Your Data</h2>
	
	<form name = "signupform" action = "beanAction.jsp" method = "post">
	
	Enter First Name:<input type = "text" name = "fname"><br/>
	Enter Email:<input type = "text" name = "email"><br/>
	Enter Mobile:<input type = "text" name = "mobile"><br/>
	Click to send data<input type = "submit" value = "send"><br/>
	<input type = "reset" value = "clean"><br/>
	
	</form>
	
<h3>check..</h3>
<jsp:useBean id="userBean" class="ai.jobiak.model.User"></jsp:useBean>
<jsp:setProperty name="userBean" property="fname" param="fname"/>
<jsp:setProperty name="userBean" property="email" param="email"/>
<jsp:setProperty name="userBean" property="mobile" param="mobile"/>
<hr>

<jsp:forward page= "showBeanData.jsp"></jsp:forward>
<hr>
  </body>
</html>