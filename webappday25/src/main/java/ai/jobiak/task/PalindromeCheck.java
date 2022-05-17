package ai.jobiak.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PalindromeCheck
 */
public class PalindromeCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PalindromeCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		String s=request.getParameter("number");
		int a=Integer.parseInt(s);
		int r=0;
		int sum=0;
		int temp=a;
		while(a>0) {
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		if(temp==sum) {
			out.println("palindrome number");
		}
		else {
			out.println("not a palindrome");
		}
		
	}

}
