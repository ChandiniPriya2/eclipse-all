package ai.jobiak.CrteServlet;

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
 * Servlet implementation class CreateAttr
 */
@WebServlet("/create")
public class CreateAttr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAttr() {
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
	context.setAttribute("Ascii of A", " 65");
	context.setAttribute("Ascii of a", "97");
	request.setAttribute("C", "Dennis Ritchie");
	request.setAttribute("Java","James Gosling");
	RequestDispatcher dispatch=context.getRequestDispatcher("/retrieveattr");
	dispatch.forward(request, response);
	}

}
