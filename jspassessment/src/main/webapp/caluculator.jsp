<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<h3 align="center">
<form method="post" action="caluculator.jsp">
Enter value:<input type="text" name="operand1" placeholder="numbers"><br/>
Enter another value:<input type="text" name="operand2" palceholder="numbers"><br/>
Enter operator:<input type="text"  name="operator" placeholder="operators"><br/>
<input type="submit" value="compute">
<input type="reset" value="clear">
</form>
<h3/>
<%
try{
	if(request.getParameter("operand1")!=null)
	{
String number1=request.getParameter("operand1");
String number2=request.getParameter("operand2");	
int a=Integer.parseInt(number1);
int b=Integer.parseInt(number2);
int c=0;
String op=request.getParameter("operator");
if(op.equals("+")) {
	c=a+b;
}
if(op.equals("-")) {
	c=a-b;
}
if(op.equals("*"))
{			
	c=a*b;
}
if(op.equals("%")) {
	c=a%b;
}
if(op.equals("/")) {
	c=a/b;
}
	
	out.println(a+op+b+"="+c);
	}
}
catch(Exception e){
	e.printStackTrace();
}

%>

</body>
</html>