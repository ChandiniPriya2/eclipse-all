<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>
<form action=evenPrint.jsp  method="post">
Enter Even Range:<input type="text" name="range"><br/>
<input type="submit" value="showNumbers">
<input type="reset" value="clear">
 </form>
</h3>
<%
try{
	if(request.getParameter("range")!=null)
	{
		int a=Integer.parseInt(request.getParameter("range"));
		for(int i=1;i<=a;i++){
			if(i%2==0){
				out.println(i);
			}
		}
		
		
	}
}
catch(Exception e){
	e.printStackTrace();
}




%>
</body>
</html>