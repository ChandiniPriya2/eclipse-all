package ai.jobiak.signupattributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WriteAttributes
 */
@WebServlet("/writeattributes")
public class WriteAttributes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WriteAttributes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=	response.getWriter();      //.append("Served at: ").append(request.getContextPath());
		ServletContext context=getServletContext();
		out.println("FullName"+context.getAttribute("Name"));
		out.println("Mail"+context.getAttribute("Email"));
		out.println("MobileNum"+context.getAttribute("Mobile"));
		
	
	}

}
