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
	public Autor getByNombre(String context) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
