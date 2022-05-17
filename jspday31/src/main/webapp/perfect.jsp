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
<form method="post" action="perfect.jsp">
Enter Number:<input type="text" name="number" palceholder="123..."><br/>
<input type="submit" value="check">
<input type="reset" value="clear">
</form>
</h3>
<%
try{
	
if(request.getParameter("number")!=null){
int a=Integer.parseInt(request.getParameter("number"));
int sum=0;
for(int i=1;i<a;i++)
{
	if(a%i==0)
	{
		sum=sum+i;
	}
}
if(sum==a)
	out.println("Perfect number");
else 
	out.println("not a perfect number");
}
}
catch(Exception e){
	e.printStackTrace();
}
%>

</body>
</html>