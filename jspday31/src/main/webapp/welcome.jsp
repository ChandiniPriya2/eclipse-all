<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"       import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
int a=10;
public int cube(int n){
return n*n*n;
}
ArrayList<String>products=new ArrayList<>();

%>
<%= new String("welcome jobiak giants")+a %>
<h2>

<% out.println("you can write code in tags");%>
</h2>
<h3>    5^3=<%=cube(5)%> </h3>
<%
products.add("html,css,js");
products.add("Typescript,Angular Js");
for(String topics:products){
	out.println(topics+"</br>");
}

%>
Size of product:<%= products.size()%>
</body>
</html>