package ups.edu.ec.Jpa;



import java.util.List;

import javax.persistence.Query;

import ups.edu.ec.Dao.CapituloDAO;
import ups.edu.ec.Modelo.Capitulo;



public class JPACapituloDAO extends JPAGenericDAO<Capitulo, Integer> implements CapituloDAO {

	public JPACapituloDAO() {
		super(Capitulo.class);
	}

	@Override 
	public List<Capitulo> BuscarLibrosByContext(String context){
		Query query= em.createNamedQuery("getByContext");
		query.setParameter("context", context);
		List<Capitulo> respuesta = (List<Capitulo>) query.getResultList();
		return respuesta; 
	}
	
	@Override
	public List<Capitulo> BuscarLibrosByCodigoAutor(int codigo){
		Query query= em.createNamedQuery("getByAutor");
		query.setParameter("codigo", codigo);
		List<Capitulo> respuesta = (List<Capitulo>) query.getResultList();
		return respuesta;
	}

	
}
