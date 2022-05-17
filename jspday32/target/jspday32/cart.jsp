<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"    import="java.util.ArrayList" %>
    <%@ page import="java.sql.*"%>
     <%@ page import="ai.jobiak.model.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
 ArrayList<Product> getProductids()
{
 String username="root";
String password="admin";
String url="jdbc:mysql://LocalHost:3306/world";
//	String productids[]=new String[10];
ArrayList<Product> productList=new ArrayList<>();
Connection con=null;
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
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return productList;
}
%>
<% 

ArrayList<Product> itemsList=null;
itemsList=getProductids();
for(int i=0;i<itemsList.size();i++) {
	out.println("<a href='cart.jsp?item="+itemsList.get(i).getProductId()+"' >AddItem  "+itemsList.get(i).getProductId()+"</a> <br/>");
}
HttpSession shoppingCart=request.getSession();
ArrayList<Product>selectedItemList=null;
if(shoppingCart.isNew()) {
selectedItemList=new ArrayList<>();
shoppingCart.setAttribute("items",selectedItemList);
}
else if(request.getQueryString()!=null){
	String queryStr=request.getQueryString();
	String splitArray[]=queryStr.split("=");
	String productId=splitArray[1];
	
	for(int i=0;i<itemsList.size();i++) {
		if(itemsList.get(i).getProductId().equals(productId)) {
		
			selectedItemList=(ArrayList<Product>)shoppingCart.getAttribute("items");
			selectedItemList.add(itemsList.get(i));
			shoppingCart.setAttribute("items", selectedItemList);
			break;
		
		}
	}
}
	if(selectedItemList!=null){
	for(Product product: selectedItemList){
	out.println(product.getProductId()+" "+product.getDescription()+" "+product.getPrice()+"<br/>");
	}
out.println("<h3>Total items in the cart "+selectedItemList.size());
}
%>
</body>
</html>