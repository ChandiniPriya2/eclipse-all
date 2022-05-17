<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
    <%@ page import="ai.jobiak.model.Product" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	
@SuppressWarnings("unchecked")
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
	}%>
</body>
</html>