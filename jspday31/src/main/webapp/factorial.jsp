<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial</title>
</head>
<body>
<form method="post" action="factorial.jsp">
Enter number:<input type="text" name="number"placeholder="1234.."><br/>
<input type="submit" value="show factorial">
<input type="reset" value="clear">
</form>
<%
try{
if(request.getParameter("number")!=null){	

String s=request.getParameter("number");
int  num=Integer.parseInt(s);
int fact=1;
for(int i=1;i<=num;i++) {
	fact=fact*i;
}
out.println("Factorial of given num is:"+fact);
}
}
catch(Exception e){
	e.printStackTrace();
}

%>
</body>
</html>