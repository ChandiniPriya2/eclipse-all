package ai.jobiak.assessment3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAttribute
 */
@WebServlet("/createcontext")
public class CreateAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAttribute() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=	response.getWriter();//.append("Served at: ").append(request.getContextPath());
	ServletContext context=getServletContext();
	
	context.setAttribute("number1",request.getParameter("operand1"));
	context.setAttribute("number2",request.getParameter("operand2"));
	
	RequestDispatcher dispatch=context.getRequestDispatcher("/getdata");
	dispatch.forward(request, response);
	
	}

}
