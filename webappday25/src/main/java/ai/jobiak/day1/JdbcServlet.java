package ai.jobiak.day1;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class JdbcServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	PrintWriter out=res.getWriter();
		String username="root";
		String password="admin";
		String url="jdbc:mysql://LocalHost:3306/world";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, username, password);
	out.println("connected to database");
			Statement st=con.createStatement();
			String sql="select * from city";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				out.println(rs.getInt(1) + "  : "+rs.getString(2)+ " : "+rs.getString(3)+": "+rs.getString(4)+":"+rs.getInt(5));     
			}
			
}		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
