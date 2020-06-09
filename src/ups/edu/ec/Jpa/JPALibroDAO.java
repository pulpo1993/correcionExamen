package ups.edu.ec.Jpa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ups.edu.ec.Dao.LibroDAO;
import ups.edu.ec.Modelo.Autor;
import ups.edu.ec.Modelo.Capitulo;
import ups.edu.ec.Modelo.Libro;

public class JPALibroDAO extends JPAGenericDAO<Libro, Integer> implements LibroDAO{


	
private EntityManager entityManager;
	
	public JPALibroDAO() {
		super(Libro.class);
		entityManager = Persistence.createEntityManagerFactory("RecuperacionExamen").createEntityManager();
	}

	
	
}
