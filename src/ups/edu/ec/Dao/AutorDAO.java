package ups.edu.ec.Dao;



import ups.edu.ec.Modelo.Autor;



public interface AutorDAO extends GenericDAO<Autor, Integer> {

	Autor getByNombre(String context);
	
	
}
