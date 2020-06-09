package ups.edu.ec.Servlets;

import java.io.IOException;
import java.util.List;

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



/**
 * Servlet implementation class BuscarLibro
 */
@WebServlet("/BuscarLibro")
public class BuscarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CapituloDAO capituloDao= DAOFactory.getDaoFactory().getCapituloDAO();
		AutorDAO autorDAO= DAOFactory.getDaoFactory().getAutorDAO();
		LibroDAO libroDao= DAOFactory.getDaoFactory().getLibroDAO();
		
		String parametro = request.getParameter("parametro");
		
		Autor a= autorDAO.getByNombre(parametro);
		
		if(a==null) {
			List<Capitulo> capitulos = capituloDao.BuscarLibrosByContext(parametro);
			System.out.println("Buscar x titulo" + capitulos.get(0));
			request.setAttribute("libros", capitulos);
			getServletContext().getRequestDispatcher("/ListaLibro.jsp").forward(request, response);
		}else {
			int codigo= a.getCodigo();
			List<Capitulo> capitulos = capituloDao.BuscarLibrosByCodigoAutor(codigo);
			request.setAttribute("libros", capitulos);
			getServletContext().getRequestDispatcher("/ListaLibro.jsp").forward(request, response);
		}
		
	}

}
