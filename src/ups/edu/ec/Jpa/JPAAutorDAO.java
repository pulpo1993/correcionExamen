package ups.edu.ec.Jpa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ups.edu.ec.Dao.AutorDAO;
import ups.edu.ec.Modelo.Autor;




public class JPAAutorDAO extends JPAGenericDAO<Autor, Integer> implements AutorDAO {

	public JPAAutorDAO() {
		super(Autor.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Autor> findByNombre(String nombre) {
		String jpql2="SELECT c FROM Autor c WHERE c.nombre='"+nombre+"'";
		List<?> autores= em.createQuery(jpql2).getResultList();
		Set<Autor> p=new HashSet<Autor>();
		for (int i = 0; i < autores.size(); i++) {			
			p.add((Autor) autores.get(i));
		}
		List<Autor> list = new ArrayList<Autor>(p);
		return list;
		
	}

}
