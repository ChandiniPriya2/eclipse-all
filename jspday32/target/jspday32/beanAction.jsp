<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Enter your data</h2>
<form name="signupform" action="beanAction.jsp" method="post">
Enter First Name:<input type="text" name="fname"><br/>
Enter Email:<input type="text" name="email"><br/>
Enter mobile:<input type="text" name="mobile"><br/>
<input type="submit" value="signup">
<input type="reset"value="clear">
</form>
<h3>check..</h3>
<jsp:useBean id="userBean" class="ai.jobiak.model.User"></jsp:useBean>
<jsp:setProperty name="userBean" property="fname" param="fname"/>
<jsp:setProperty property="email" name="userBean" param="email"/>
<jsp:setProperty property="mobile" name="userBean" param="mobile"/>
<hr>
<h3>
Your Data is:
First Name:<jsp:getProperty name="userBean" property="fname"/><br>
Email:          <jsp:getProperty name="userBean" property="email"/><br>
Mobile:        <jsp:getProperty name="userBean" property="mobile"/><br>

</h3>
<hr>
<!-- 
<hr>
<jsp: forward page="showBeanData.jsp"></ jsp:forward>
<hr>
  -->

</body>
</html>