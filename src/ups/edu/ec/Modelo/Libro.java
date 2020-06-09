package ups.edu.ec.Modelo;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity
public class Libro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int codigo;
	private String nombre;
	private String isBN;
	private int numPaginacion;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "libro")
	private Set<Capitulo> capitulos;
	
	
	
	public Libro() {
		super();
	}



	public Libro(int codigo, String nombre, String isBN, int numPaginacion, Set<Capitulo> capitulos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.isBN = isBN;
		this.numPaginacion = numPaginacion;
		this.capitulos = capitulos;
	}

	



	public Libro(String nombre, String isBN, int numPaginacion) {
		super();
		this.nombre = nombre;
		this.isBN = isBN;
		this.numPaginacion = numPaginacion;
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



	public String getIsBN() {
		return isBN;
	}



	public void setIsBN(String isBN) {
		this.isBN = isBN;
	}



	public int getNumPaginacion() {
		return numPaginacion;
	}



	public void setNumPaginacion(int numPaginacion) {
		this.numPaginacion = numPaginacion;
	}



	public Set<Capitulo> getCapitulos() {
		return capitulos;
	}



	public void setCapitulos(Set<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}


	
	public void addCapitulo(Capitulo capitulo) {
		this.capitulos.add(capitulo);
	}
	
	public void removeCapitulo(Capitulo capitulo) {
		this.capitulos.remove(capitulo);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capitulos == null) ? 0 : capitulos.hashCode());
		result = prime * result + codigo;
		result = prime * result + ((isBN == null) ? 0 : isBN.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numPaginacion;
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
		if (capitulos == null) {
			if (other.capitulos != null)
				return false;
		} else if (!capitulos.equals(other.capitulos))
			return false;
		if (codigo != other.codigo)
			return false;
		if (isBN == null) {
			if (other.isBN != null)
				return false;
		} else if (!isBN.equals(other.isBN))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numPaginacion != other.numPaginacion)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", isBN=" + isBN + ", numPaginacion=" + numPaginacion
				+ ", capitulos=" + capitulos + "]";
	}
	
	
	
	
}