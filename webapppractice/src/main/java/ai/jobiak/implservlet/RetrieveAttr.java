package ai.jobiak.implservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetrieveAttr
 */
@WebServlet("/retrieveattr")
public class RetrieveAttr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveAttr() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=	response.getWriter();//.append("Served at: ").append(request.getContextPath());
	ServletContext context=getServletContext();
	out.println("Ascii Value of A  "+context.getAttribute("Ascii of A"));
	out.println("Ascii value of a   "+context.getAttribute("Ascii of a"));
	out.println("Inventor of c  "+request.getAttribute("C"));
	out.println("Inventor of java  "+request.getAttribute("Java"));
	
	}
}

