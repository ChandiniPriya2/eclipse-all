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
<form method="post" action="fib.jsp">
Enter Range:<input type="text" name="number" placeholder="range"><br/>
<input type="submit" value="printSeries">
<input type="reset" value="clear">
</form>
</h3>
<%
try
{
if(request.getParameter("number")!=null){	
int a=Integer.parseInt(request.getParameter("number"));
int  n1=0;
int n2=1;
int n3;
out.println(n1+"\n "+n2);
for(int i=2;i<a;i++)
{
	n3=n1+n2;
	out.println(" "+n3);
	n1=n2;
	n2=n3;
}
}
}
catch(Exception e){
	e.printStackTrace();
}
%>
</body>
</html>