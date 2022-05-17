package ai.jobiak.shopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartCreation
 */
@WebServlet("/cart")
public class CartCreation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartCreation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=	response.getWriter();//.append("Served at: ").append(request.getContextPath());
	response.setContentType("text/html");
	out.println("<a href='cart'>AddItem</a>");
	ArrayList<Product> itemsList=null;
HttpSession shoppingCart=request.getSession();
	if(shoppingCart.isNew()) {
		itemsList=new ArrayList<>();//
	shoppingCart.setAttribute("items",itemsList);
	}else {
		itemsList=(ArrayList<Product>)shoppingCart.getAttribute("items");
		Product p=new Product("AFJ101+R","XHW5 QuadCopper",5375.00);
		itemsList.add(p);
		shoppingCart.setAttribute("items",itemsList);
		for(Product product:itemsList){
		out.println("Description "+product.getDescription());
		
	
	
	}
	
	
	
	}

}
}