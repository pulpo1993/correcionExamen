package ups.edu.ec.Dao;


import java.util.List;

import ups.edu.ec.Modelo.Capitulo;

public interface CapituloDAO extends GenericDAO<Capitulo, Integer>{

	List<Capitulo> BuscarLibrosByCodigoAutor(int codigo);

	List<Capitulo> BuscarLibrosByContext(String context);

}
