<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">
<form method="post" action="contactinfo.jsp">
Enter Name:<input type="text" name="fullname" placeholder="aaaaaa"><br/>
Enter mobile:<input type="text" name="mobile " placeholder="9999999999"><br/>
<input type="submit" value="signup">
<input type="reset"value="clear">
</form>
</h3>
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
%>
<%
String fnameStr=request.getParameter("fullname");
String  mobileStr=request.getParameter("mobile");
Connection con=connect();
int count=0;
PreparedStatement ps;
try {
ps = con.prepareStatement("insert into contacts values(?,?,?)");
ps.setString(1, fnameStr);
ps.setString(3, mobileStr);
count=ps.executeUpdate();
}
catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
%>
</body>
</html>