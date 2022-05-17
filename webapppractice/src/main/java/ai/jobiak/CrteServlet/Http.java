package ai.jobiak.CrteServlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Http
 */
@WebServlet("/config")
public class Http extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Http() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fName=request.getParameter("nAme");
		String lName=request.getParameter("lastname");
		String Gen=request.getParameter("gen");
		int Age=Integer.parseInt(request.getParameter("dob"));
		PreparedStatement ps;
		Connection con=connect();
		int count=0;
		try {
			ps=con.prepareStatement("insert into fbsignup values(?,?,?,?)");
			ps.setString(1, fName);
			ps.setString(2, lName);
			ps.setString(3, Gen);
			ps.setInt(4, Age);
			count=ps.executeUpdate();
			}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().println(count+" records inserted");
		
	}

}
