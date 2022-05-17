package ai.jobiak.assessment3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetInput
 */
@WebServlet("/getdata")
public class GetInput extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetInput() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();//).append("Served at: ").append(request.getContextPath());

		
		ServletContext context=getServletContext();
		int a=(int) context.getAttribute("number1");
		int b=(int) (context.getAttribute("number2"));
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
