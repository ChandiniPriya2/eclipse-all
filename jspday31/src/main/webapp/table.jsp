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
<form method="post" action="table.jsp" >
Enter From:<input type="text" name="startingnum" placeholder="enter a number"><br/>
Enter To:<input type="text" name="endingnum"placeholder="enter another num"><br/>
<input type="submit" value="showTable">
<input type="reset" value="clear">
</form>
</h3>
<%
try{
	if(request.getParameter("startingnum")!=null){

String num1=request.getParameter("startingnum");
String num2=request.getParameter("endingnum");	
int x=Integer.parseInt(num1);
int y=Integer.parseInt(num2);
for(int i=1;i<=y;i++) {
	out.println(x+"*"+i+"="+(x*i)+"</br>");
}
	}
}
catch(Exception e){
	e.printStackTrace();
}

%>


</body>
</html>