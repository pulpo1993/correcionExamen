package ups.edu.ec.Dao;

import java.util.List;

import ups.edu.ec.Modelo.Autor;



public interface AutorDAO extends GenericDAO<Autor, Integer> {

	List<Autor> findByNombre(String string);
	
	
}
