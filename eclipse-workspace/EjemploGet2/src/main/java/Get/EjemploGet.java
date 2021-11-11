package Get;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EjemploGet
 */
@WebServlet("/EjemploGet")
public class EjemploGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploGet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			PrintWriter out = response.getWriter();
			int numParams = 0;
			
			out.println("<html>");
			out.println("<head><title> Ejemplo de peticiones GET desde Servlet</title></head>");
			out.println("<body>");
			
			Enumeration paramEnumeration = request.getParameterNames();
			
			if (!paramEnumeration.hasMoreElements()) {
				
				out.println("<p><a href=\"?modulo=servidor&profesor=Juan Diego Perez \">Pasando parámetros<a><p>");
				
			} else {
				
				out.println("<ul>");
				
				while (paramEnumeration.hasMoreElements()) {
					String param = (String) paramEnumeration.nextElement();
					
					out.println("<li>Ha recibido el parámetro "+param+"con el siguiente valor: "+request.getParameter(param)+"</li>");
					
					out.println("</ul>");
				}
				
				
			}
			
			
			
			out.println("</body>");
			out.println("</html>");
			out.close();
	}



}
