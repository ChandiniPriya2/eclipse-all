package ai.jobiak.CrteServlet;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfig
 */
@WebServlet(
		urlPatterns = { "/servletconfig" }, 
		initParams = { 
				@WebInitParam(name = "name", value = "chandini"), 
				@WebInitParam(name = "age", value = "22"), 
				@WebInitParam(name = "job", value = "software")
		})
public class ServletConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfig() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=	response.getWriter();//.append("Served at: ").append(request.getContextPath());
	
	javax.servlet.ServletConfig config=getServletConfig();
	String detail1=config.getInitParameter("name");
	String detail2=config.getInitParameter("age");
	String detail3=config.getInitParameter("job");
	out.println("Name  "+detail1);
	out.println("Age  "+detail2);
	out.println("Job  "+detail3);
	
	}

}
