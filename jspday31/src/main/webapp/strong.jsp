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
<form method="post" action="strongcheck">
Enter Number:<input type="text" name="number"placeholder="enter number"><br/>
<input type="submit" value="check">
<input type="reset" value="clear">
</form>
</h3>
<%
try{
if(request.getParameter("number")!=null)	
{
int a=Integer.parseInt(request.getParameter("number"));
int m=a;
int r=0;
int sum=0;
 while(a!=0){
	 int fact=1;
	 r=a%10;
	for(int i=1;i<=r;i++){
		fact=fact*i;
 		}
 a=a/10;
 sum=sum+fact;

 }
 if(sum==m)
out.println(" strong number");
 else 
 out.println("not a strong number");
}
}
catch(Exception e){
	e.printStackTrace();
}



%>

</body>
</html>