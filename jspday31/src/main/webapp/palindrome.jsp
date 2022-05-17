<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">
<form method="post" action="palindrome.jsp">
Enter Number:<input type="text" name="number" placeholder="12345.."><br/>
<input type="submit" value="check">
<input type="reset" value="clear">

</form>

</h3>
<%
try{
if(request.getParameter("number")!=null)	
{
String s=request.getParameter("number");
int a=Integer.parseInt(s);
int r=0;
int sum=0;
int temp=a;
while(a>0) {
	r=a%10;
	sum=(sum*10)+r;
	a=a/10;
}
if(temp==sum) {
	out.println("palindrome number");
}
else {
	out.println("not a palindrome");
}
}
}
catch(Exception e){
	e.printStackTrace();
}

%>

</body>
</html>