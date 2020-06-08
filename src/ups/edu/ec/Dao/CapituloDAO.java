package ups.edu.ec.Dao;

import ups.edu.ec.Modelo.Capitulo;

public interface CapituloDAO extends GenericDAO<Capitulo, Integer>{

	Capitulo findByNumero(int parseInt);

}
