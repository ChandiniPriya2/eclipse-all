<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="armstrong.jsp" method="post">
Enter number:<input type="text" name="num" placeholder="12345.."><br/>
<input type="submit" value="check">
<input type="reset" value="clear">
</form>
<%
try{
	
if(request.getParameter("num")!=null){
int a=Integer.parseInt(request.getParameter("num"));
int temp=a;
int sum=0;
int r=0;
while(temp!=0) {
r=temp%10;
sum=sum+r*r*r;
temp=temp/10;
}
if(sum==a)
	out.println("Armstrong number");
else
	out.println("Not an armstrong number");
}
}
catch(Exception e){
	e.printStackTrace();
}
%>
</body>
</html>