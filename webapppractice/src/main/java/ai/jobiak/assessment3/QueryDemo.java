package ai.jobiak.assessment3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryDemo
 */
@WebServlet("/demo")
public class QueryDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();//.append("Served at: ").append(request.getContextPath());
		String quertString = request.getQueryString();//method to get queryString in the url
		String keyvalues[]=quertString.split("&");//keyvalue pairs
		out.println("These Are the Key Value Pairs in QueryString");
		for(String data: keyvalues )
		{
			out.println(data);
		}
		out.println("These Are the Keys in QueryString");
		for(String dat: keyvalues )
		{
			String va[]=dat.split("=");
			out.println(va[0]);
		}
		out.println("These Are the Values in QueryString");
		for(String dat: keyvalues )
		{
			String va[]=dat.split("=");
			out.println(va[1]);
		}


		
	}

}
