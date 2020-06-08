package ups.edu.ec.Modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Autor implements Serializable{

	@Id
	private int codigo;
	private String nombre;
	private String Nacionalidad;
	
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
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public Autor(int codigo, String nombre, String nacionalidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		Nacionalidad = nacionalidad;
	}
	public Autor() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nacionalidad == null) ? 0 : Nacionalidad.hashCode());
		result = prime * result + codigo;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Autor other = (Autor) obj;
		if (Nacionalidad == null) {
			if (other.Nacionalidad != null)
				return false;
		} else if (!Nacionalidad.equals(other.Nacionalidad))
			return false;
		if (codigo != other.codigo)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Autor [codigo=" + codigo + ", nombre=" + nombre + ", Nacionalidad=" + Nacionalidad + "]";
	}
	
	
	
	
	
	
	
	
	
}
