package ups.edu.ec.Jpa;



import javax.persistence.Query;

import ups.edu.ec.Dao.CapituloDAO;
import ups.edu.ec.Modelo.Capitulo;



public class JPACapituloDAO extends JPAGenericDAO<Capitulo, Integer> implements CapituloDAO {

	public JPACapituloDAO() {
		super(Capitulo.class);
	}

	@Override
	public Capitulo findByNumero(int numTar) {
				
		String jpql="SELECT c FROM Capitulo c WHERE c.numero="+numTar;
		Query query=em.createQuery(jpql);
		Capitulo c=(Capitulo) query.getSingleResult();
		
		return c;
	}
}
