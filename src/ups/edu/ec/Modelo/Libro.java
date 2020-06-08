package ups.edu.ec.Modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable {

	@Id
	private int codigo;
	private String nombre;
	private String isBN;
	private int numPaginacion;
	
	
	public Libro(int codigo, String nombre, String isBN, int numPaginacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.isBN = isBN;
		this.numPaginacion = numPaginacion;
		
	}


	public Libro() {
		super();
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
				+ "]";
	}


	

	
	
	
	
	
}
