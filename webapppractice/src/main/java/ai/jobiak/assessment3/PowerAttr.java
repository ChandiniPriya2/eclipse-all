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
 * Servlet implementation class PowerAttr
 */
@WebServlet("/power")
public class PowerAttr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PowerAttr() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out=		response.getWriter();//.append("Served at: ").append(request.getContextPath());
ServletContext context=getServletContext();
int d1= Integer.parseInt(context.getInitParameter("d"));
int a1= Integer.parseInt(context.getInitParameter("a"));
double res=Math.pow(a1, d1);
out.println(res);
	
	}

}
