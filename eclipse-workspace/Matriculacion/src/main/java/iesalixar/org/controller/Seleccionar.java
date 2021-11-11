package iesalixar.org.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Seleccionar
 */
@WebServlet("/Seleccionar")
public class Seleccionar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Seleccionar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("seleccionar.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession sesion = request.getSession(false);
		
		if(!sesion.isNew() && sesion.getAttribute("usuario") != null) {
			
			String nombre = request.getParameter("nombre");
			String apellidos = request.getParameter("apellidos");
			String correo = request.getParameter("correo");
			String curso = request.getParameter("curso");
			String[] modulos = request.getParameterValues("modulos");
			
			sesion.setAttribute("nombre", nombre);
			sesion.setAttribute("apellidos", apellidos);
			sesion.setAttribute("correo", correo);
			sesion.setAttribute("modulos", modulos);
			Cookie cookieCurso = new Cookie ("curso", curso);
			response.addCookie(cookieCurso);
			response.sendRedirect("Confirmacion");
			
		}else {
			response.sendRedirect("Logout");
		}
		
	}

}
