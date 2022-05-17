package ai.jobiak.assessment3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdharServlet
 */
@WebServlet("/adhar")
public class AdharServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdharServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Connection con=connect();
		Statement st;
		try {
			st = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true) {
		System.out.println("Menu");
		System.out.println("1.Apply for new Aadhar");
		System.out.println("2.Modify Adhar Name");
		System.out.println("3.View your Adhar");
		System.out.println("4.Exit");
		System.out.println("Enter your choice ");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option) {
		case 1:
			String fnameStr=request.getParameter("fullname");
			String num=request.getParameter("adharnum");
			String fullAdd =request.getParameter("adress");
			String faname =request.getParameter("father");
			String Gender =request.getParameter("gender");
			String dateofbirth=request.getParameter("dob");
			int count=0;
			PreparedStatement ps;
			try {
			ps = con.prepareStatement("insert into adharinfo values(?,?,?)");
			ps.setString(1, fnameStr);
			ps.setString(2,num );
			ps.setString(3, fullAdd);
			ps.setString(4, faname);
			ps.setString(5, Gender);
			ps.setString(6, dateofbirth);
			count=ps.executeUpdate();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().println(count+" records inserted");
			break;
		case 2:
			String modifyName=request.getParameter("modname");
			String number=request.getParameter("adharnum");
			
			try {
				PreparedStatement pstmt=con.prepareStatement("update adharinfo set name=? where adharnum=?") ;
				pstmt.setString(1, modifyName);
				pstmt.setString(2, number);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	break;
		case 3:
			try {
				Statement stmt=con.createStatement();
				String sql="select * from adharinfo";
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next()) {
					out.println(rs.getString(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3)+rs.getString(4)+rs.getString(5)+rs.getString(6));
				}
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	break;
		case 4 :
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("disconnected from database");
			break;
		}
		}
		
	}

}
