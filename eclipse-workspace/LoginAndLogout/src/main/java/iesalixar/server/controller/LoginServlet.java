package iesalixar.server.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import iesalixar.server.model.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession sesion = null;
		
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		if(usuario.equals("admin") && password.equals("admin")) {
			
			sesion = request.getSession();
			Usuario user = new Usuario();
			user.setNombre(usuario);
			sesion.setAttribute("usuario", user);
			
			response.sendRedirect("AdminServlet");
			
		}else if (usuario.equals("usuario") && password.equals("usuario")){
			
			
			response.sendRedirect("UsuarioServlet");

		}else {
			
			
			response.sendRedirect("LoginServlet");

		}
		
		
		
	
		
	}

}
