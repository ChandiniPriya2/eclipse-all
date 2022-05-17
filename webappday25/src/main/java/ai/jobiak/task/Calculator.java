package ai.jobiak.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
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
		PrintWriter out=response.getWriter();
		String number1=request.getParameter("operand1");
		String number2=request.getParameter("operand2");	
		int a=Integer.parseInt(number1);
	int b=Integer.parseInt(number2);
		int c=0;
		String op=request.getParameter("operator");
		if(op.equals("+")) {
			c=a+b;
		}
		if(op.equals("-")) {
			c=a-b;
		}
		if(op.equals("*"))
		{			
			c=a*b;
		}
		if(op.equals("%")) {
			c=a%b;
		}
		if(op.equals("/")) {
			c=a/b;
		}
		out.println(a+op+b+"="+c);
		}
	
	
	}


