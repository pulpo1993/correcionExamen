package ups.edu.ec.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.ec.Dao.AutorDAO;
import ups.edu.ec.Dao.CapituloDAO;
import ups.edu.ec.Dao.DAOFactory;
import ups.edu.ec.Dao.LibroDAO;
import ups.edu.ec.Modelo.Autor;
import ups.edu.ec.Modelo.Capitulo;
import ups.edu.ec.Modelo.Libro;



/**
 * Servlet implementation class CrearLibro
 */
@WebServlet("/CrearLibro")
public class CrearLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    
        // TODO Auto-generated constructor stub
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		System.out.println("llega al metodo");
	
		String nombre = request.getParameter("nombre");
		String ISBN = request.getParameter("ISBN");
		int numPaginas= Integer.parseInt(request.getParameter("numPaginas"));
		
		int numCap= Integer.parseInt(request.getParameter("numCap"));
		String nombreCap = request.getParameter("nombreCap");
		int codigoAutor= Integer.parseInt(request.getParameter("codigoAutor"));
		
		
		CapituloDAO capituloDao= DAOFactory.getDaoFactory().getCapituloDAO();
		AutorDAO autorDAO= DAOFactory.getDaoFactory().getAutorDAO();
		LibroDAO libroDao= DAOFactory.getDaoFactory().getLibroDAO();
		
		Libro libro= new Libro(nombre, ISBN, numPaginas);
		
		Autor autor= autorDAO.read(codigoAutor);
		System.out.println("autor encontrado: "+ autor);
		
		Capitulo capitulo= new Capitulo(numCap, nombreCap, libro, autor);
		
		libro.addCapitulo(capitulo);
		libroDao.create(libro);
		
		response.sendRedirect("Buscar.html");
		
		
		
		
	}

}
