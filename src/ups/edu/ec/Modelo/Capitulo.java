package ups.edu.ec.Modelo;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Capitulo implements Serializable{
	
	
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	 private int codigo;
	 private int numero;
	 private String titulo;
	 

	@ManyToOne
	@JoinColumn
	 private Libro libro;
	

	@OneToOne
	@JoinColumn
	private Autor autor;
	 
	 public Capitulo(int codigo, int numero, String titulo, Libro libro, Autor autor) {
			super();
			this.codigo = codigo;
			this.numero = numero;
			this.titulo = titulo;
			this.libro = libro;
			this.autor = autor;
		}
	 
	 
	 public Capitulo(int numero, String titulo, Libro libro, Autor autor) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.libro = libro;
		this.autor = autor;
	}


	public Capitulo() {
			super();
		}
	 
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + codigo;
		result = prime * result + ((libro == null) ? 0 : libro.hashCode());
		result = prime * result + numero;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Capitulo other = (Capitulo) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (codigo != other.codigo)
			return false;
		if (libro == null) {
			if (other.libro != null)
				return false;
		} else if (!libro.equals(other.libro))
			return false;
		if (numero != other.numero)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Capitulo [codigo=" + codigo + ", numero=" + numero + ", titulo=" + titulo + ", libro=" + libro
				+ ", autor=" + autor + "]";
	}
	 
	 

}
