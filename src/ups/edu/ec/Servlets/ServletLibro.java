package ups.edu.ec.Servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.ec.Jpa.JPADAOFactory;
import ups.edu.ec.Modelo.Autor;
import ups.edu.ec.Modelo.Capitulo;
import ups.edu.ec.Modelo.Libro;



/**
 * Servlet implementation class ServletLibro
 */
@WebServlet("/ServletLibro")
public class ServletLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletLibro() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Capitulo cap = JPADAOFactory.getFactory().getCapituloDAO().read(553);
		Libro libro = JPADAOFactory.getFactory().getLibroDAO().read(551);
		Autor autor = JPADAOFactory.getFactory().getAutorDAO().read(552);
		cap.setTitulo("hola");
		cap.setLibro(libro);
		cap.setAutor(autor);
		
		//System.out.println(JPADAOFactory.getFactory().getCapituloDAO().update(cap));
		//System.out.println(JPADAOFactory.getFactory().getCapituloDAO().update(cap));
		
		//JPADAOFactory.getFactory().getLibroDAO().getLibrosAutorCapitulo(autor, cap);
		//System.out.println(JPADAOFactory.getFactory().getLibroDAO().getLibrosAutorCapitulo(autor, cap));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest requesidt, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Proceso para crear un libro
		
		
	}
	
	

}
