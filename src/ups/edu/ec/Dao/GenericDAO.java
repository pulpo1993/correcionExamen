package ups.edu.ec.Dao;

import java.util.List;

import ups.edu.ec.Modelo.Autor;
import ups.edu.ec.Modelo.Capitulo;
import ups.edu.ec.Modelo.Libro;

public interface GenericDAO <T,ID> {
	
	public void createTable();

    public void create(T entity);
    
    public T read(ID id);
    
    public T findById(ID id);

    public void update(T entity);

    public void delete(T entity);
    
    public List<T> find();

    public List<T> find(String[] attributes, String[] values); // like + and

    public List<T> find(String[] attributes, String[] values, String order, int index, int size);

}
