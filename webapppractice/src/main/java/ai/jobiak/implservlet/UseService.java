package ai.jobiak.implservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UseService implements Servlet {

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
		String user="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			out.println("connected to database");
			Statement st=con.createStatement();
			String sql="select * from adharinfo ";
		
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				out.println(rs.getString(1)+":"+rs.getLong(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5)+":"+rs.getString(6));
			}
				} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
