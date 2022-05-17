package ai.jobiak.task;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupData
 */
public class SignupData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupData() {
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
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Connection con=connect();
		PrintWriter out=response.getWriter();
		try {
			Statement st=con.createStatement();
			String sql="select * from signup";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				out.println(rs.getString(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3));
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
