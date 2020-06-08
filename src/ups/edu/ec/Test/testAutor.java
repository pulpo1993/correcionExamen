package ups.edu.ec.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import ups.edu.ec.Modelo.Autor;

public class testAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = Persistence.createEntityManagerFactory("RecuperacionExamen").createEntityManager();
		Autor a = new Autor(1,"Juan","Ecuatoriano");
		em.getTransaction().begin();
		em.persist(a);
		em.persist(new Autor(2,"Juan","Ecuatoriano"));
		em.getTransaction().commit();
	}

}
