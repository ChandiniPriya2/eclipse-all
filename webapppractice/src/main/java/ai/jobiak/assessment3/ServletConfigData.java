package ai.jobiak.assessment3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigData
 */
@WebServlet(
		urlPatterns = { "/servconfig" }, 
		initParams = { 
				@WebInitParam(name = "College", value = "Guntur"), 
				@WebInitParam(name = "Branch", value = "Cse"), 
				@WebInitParam(name = "Degree", value = "Btech")
		})
public class ServletConfigData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		 ServletConfig config=getServletConfig();
		 String clg=config.getInitParameter("College");
		 String stream=config.getInitParameter("Branch");
		 String qual =config.getInitParameter("Degree");
		 out.println(clg);
		 out.println(stream);
		 out.println(qual);
		 
		
	}

}
