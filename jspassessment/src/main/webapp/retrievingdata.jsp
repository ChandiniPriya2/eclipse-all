<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"   %>
     <%@ page import="java.sql.*"%>
      <%@ page import="java.util.*"%>
      <%@page import="ai.jobiak.assess.Values" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
private Connection connect()
{
	String username="root";
	String password="admin";
	String url="jdbc:mysql://LocalHost:3306/world";
	Connection con=null;
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection(url, username, password);
}
	catch(SQLException e) {
		e.printStackTrace();
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	return con;
	}
ArrayList<Values>val=new ArrayList<>();
%>
<%
try{
Connection con=connect();
Statement	st = con.createStatement();
String sql="select * from signup";
ResultSet rs=st.executeQuery("sql");

while(rs.next()){
Values v=new Values(rs.getString(1),rs.getString(2),rs.getInt(3));
val.add(v);
}
String sql1="select  count(*) from signup";
int a=Integer.parseInt(sql1);
if(val.size()==a){
	for(Values data:val){
		out.println(data+"<br>");
	}
}
}
catch(Exception e){
	e.printStackTrace();
}

%>

</body>
</html>