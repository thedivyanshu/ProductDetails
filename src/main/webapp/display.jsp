<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.product.pojo.*"%>
<%@ page import="java.util.List"%>
<%@ page import="javax.servlet.http.HttpSession"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
	<h2>Product Details</h2>

	<%-- Retrieve product from session --%>
	<%List<Product> productList = (List<Product>) session.getAttribute("productList");%>
	<%-- Display product details --%>
	<% if (productList != null && !productList.isEmpty()) { %>
	<ul>
		<% for (Product product : productList) { %>
		<li>Product: <%= product.getpName() %>, Price: Rs<%= product.getpCost() %>,Quantity: <%= product.getpQuantity() %></li>
		<% } %>
	</ul>
	<% } else { %>
	<p>No product details available.</p>
	<% } %>

	<p>
		<a href="ProductForm.jsp">Go back to the form</a>
	</p>
</body>
</html>