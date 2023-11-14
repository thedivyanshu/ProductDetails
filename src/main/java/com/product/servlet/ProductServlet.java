package com.product.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.product.pojo.Product;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("text/html;charset=UTF-8");

        String productName = request.getParameter("productName");
        String productPrice = request.getParameter("productPrice");
        String productQuantity = request.getParameter("productQuantity");

        // Create a new Product object
        Product product = new Product(productName, productPrice, productQuantity);
        HttpSession session = request.getSession(true);
        List<Product> productList = (List<Product>) session.getAttribute("productList");
        if (productList == null) {
            productList = new ArrayList<>();
        }
        productList.add(product);
        session.setAttribute("productList", productList);
        // Redirect to display JSP
        request.getRequestDispatcher("display.jsp").forward(request, response);
	}

}
