package ai.jobiak.CrteServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student
 */
@WebServlet("/student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
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
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();//.append("Served at: ").append(request.getContextPath());
		ServletContext context=getServletContext();
		try {
	Connection	con=connect();
		Statement st=con.createStatement();
		String s="select * from student where stuid=501";
		ResultSet rs=st.executeQuery(s);
		while(rs.next()) {
			context.setAttribute("rollNo",rs.getInt(1) );
			context.setAttribute("firstname", rs.getString(2));
			context.setAttribute("lastName", rs.getString(3));
			context.setAttribute("branch",rs.getString(4));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		RequestDispatcher dispatcher=context.getRequestDispatcher("/stuData");
		dispatcher.forward(request, response);
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
