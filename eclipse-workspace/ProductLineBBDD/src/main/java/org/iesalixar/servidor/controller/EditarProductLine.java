package org.iesalixar.servidor.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.dao.ProductLineDaoImpl;
import org.iesalixar.servidor.model.ProductLine;


/**
 * Servlet implementation class EditarProductLine
 */
@WebServlet("/EditarProductLine")
public class EditarProductLine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarProductLine() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String productLine = request.getParameter("pl");
		
		ProductLineDaoImpl daoImpl = new ProductLineDaoImpl();
		
		ProductLine product = daoImpl.getProductLine(productLine);
		
		request.setAttribute("producto", product);
		
		request.getRequestDispatcher("WEB-INF/view/update.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String productLineParam = request.getParameter("pl");
		//Aquí necesitas coger TODOS LOS PARAMETROS PARA CONSTRUIR OBJETO	

		
		if (productLineParam!=null) {
			
			//ProductLine productLine = new ProductLine(productLineParam);
			
			ProductLineDaoImpl daoImpl = new ProductLineDaoImpl();
			
			//daoImpl.updateProductLine(productLine);
	}
		
		response.sendRedirect(request.getContextPath());
	}


}