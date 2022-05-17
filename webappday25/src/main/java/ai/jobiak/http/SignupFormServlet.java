package ai.jobiak.http;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupFormServlet
 */
public class SignupFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */ private Connection connect()
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
		String fnameStr=request.getParameter("fname");
		String emailStr=request.getParameter("email");
		String  mobileStr=request.getParameter("mobile");
		Connection con=connect();
		int count=0;
		PreparedStatement ps;
		try {
		ps = con.prepareStatement("insert into signup values(?,?,?)");
		ps.setString(1, fnameStr);
		ps.setString(2, emailStr);
		ps.setString(3, mobileStr);
		count=ps.executeUpdate();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().println(count+" records inserted");
	}

}
