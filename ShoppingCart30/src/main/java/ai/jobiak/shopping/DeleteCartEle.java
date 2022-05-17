package ai.jobiak.shopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DeleteCartEle
 */
@WebServlet("/delete")
public class DeleteCartEle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCartEle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    private ArrayList<Product> getproductids()
    {
    	String username="root";
		String password="admin";
		String url="jdbc:mysql://LocalHost:3306/world";
		Connection con=null;
		ArrayList<Product> productList=new ArrayList<>();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
 con=DriverManager.getConnection(url, username, password);
 Statement st=con.createStatement();
	String sql="select * from products";
	ResultSet rs=st.executeQuery(sql);
	
	while(rs.next()) {
	Product p=new Product(rs.getString(1),rs.getString(2),rs.getDouble(3));
		productList.add(p);
		}
    }
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return productList;
		}
	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=	response.getWriter();//.append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		ArrayList<Product> itemsList=null;
		itemsList=getproductids();
		for(int i=0;i<itemsList.size();i++) {
			out.println("<a href='delete?item="+itemsList.get(i).getProductId()+"' >DeleteItem  "+itemsList.get(i).getProductId()+"</a> <br/>");
		}
		HttpSession shoppingCart=request.getSession();
		ArrayList<Product>selectedItemList=null;
			if(shoppingCart.isNew()) {
			selectedItemList=new ArrayList<>();
			shoppingCart.setAttribute("items",selectedItemList);
			}
			else {
				String queryStr=request.getQueryString();
				String splitArray[]=queryStr.split("=");
				String productId=splitArray[1];
			
				for(int i=0;i<itemsList.size();i++) {
					if(itemsList.get(i).getProductId().equals(productId)) {
						selectedItemList.remove(itemsList.get(i));
						shoppingCart.setAttribute("items", selectedItemList);
						break;
					}
				}
				out.println("Total items in the cart are"+selectedItemList.size());
			
}
			}

	}

