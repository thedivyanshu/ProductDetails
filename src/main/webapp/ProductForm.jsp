<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.product.pojo.*" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
</head>
<body>
 <h2>Product Form</h2>
    <form action="ProductServlet" method="post">
        <label for="productName">Product Name:</label>
        <input type="text" id="pName" name="productName" required><br>

        <label for="productPrice">Product Price:</label>
        <input type="number" id="pCost" name="productPrice" required><br>

        <label for="productQuantity">Product Quantity:</label>
        <input type="number" id="pQuantity" name="productQuantity" required><br>

        <input type="submit" value="Submit">
        </form>
        <p><a href="display.jsp">View Product</a></p>
</body>
</html>