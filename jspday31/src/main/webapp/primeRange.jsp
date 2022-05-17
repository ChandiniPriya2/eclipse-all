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
<form method="post"  action="primeRange.jsp">

Enter To:<input type="text" name="endingnum"placeholder="enter range"><br/>
<input type="submit" value="showNumbers">
<input type="reset" value="clear">
</form>
</h3>
<%
try{
if(request.getParameter("endingnum")!=null)	
{
String s=request.getParameter("endingnum");
int b=Integer.parseInt(s);

for(int i=1;i<=b;i++)
{
		int count=0;
	for(int j=1;j<=i;j++)
  {
				if(i%j==0)
				{
						count++;
				}
   }                
           if(count==2)
          {
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