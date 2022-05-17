package ai.jobiak.signupattributes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
 * Servlet implementation class ReadAttributes
 */
@WebServlet("/readattributes")
public class ReadAttributes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadAttributes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		PrintWriter out=response.getWriter();//.append("Served at: ").append(request.getContextPath());
		String username="root";
		String password="admin";
		String url="jdbc:mysql://LocalHost:3306/world";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, username, password);
		
	Statement	st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		String sql="select * from signup";
		ResultSet rs=st.executeQuery(sql);
		rs.first();
		ServletContext context=getServletContext();
		
		context.setAttribute("Name", rs.getString(1));
			context.setAttribute("Email",rs.getString(2) );
			context.setAttribute("Mobile", rs.getString(3));
			RequestDispatcher dispatcher=context.getRequestDispatcher("/writeattributes");
			dispatcher.forward(request, response);
			
			} catch (SQLException |ClassNotFoundException  e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}

}
