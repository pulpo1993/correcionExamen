package ups.edu.ec.Modelo;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;






@Entity
public class Libro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	@Column(name = "ISBN", unique = true, nullable = false)
	private String ISBN;
	private int numPaginas;
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "libro")
	private Set<Capitulo> listaCapitulos = new HashSet<Capitulo>(); 
	
	
	
	public Libro() {
		super();
	}



	public Libro(String nombre, String iSBN, int numPaginas) {
		super();
		this.nombre = nombre;
		ISBN = iSBN;
		this.numPaginas = numPaginas;
	}

	

	public Libro(int codigo, String nombre, String iSBN, int numPaginas, Set<Capitulo> listaCapitulos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		ISBN = iSBN;
		this.numPaginas = numPaginas;
		this.listaCapitulos = listaCapitulos;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getISBN() {
		return ISBN;
	}



	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}



	public int getNumPaginas() {
		return numPaginas;
	}



	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}



	public Set<Capitulo> getListaCapitulos() {
		return listaCapitulos;
	}



	public void setListaCapitulos(Set<Capitulo> listaCapitulos) {
		this.listaCapitulos = listaCapitulos;
	}
	
	public void addCapitulo(Capitulo capitulo) {
		this.listaCapitulos.add(capitulo);
	}
	
	public void removeCapitulo(Capitulo capitulo) {
		this.listaCapitulos.remove(capitulo);
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", ISBN=" + ISBN + ", numPaginas=" + numPaginas + "]";
	}

	
	
	
}