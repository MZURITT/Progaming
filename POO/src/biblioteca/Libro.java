package biblioteca;

import java.util.ArrayList;

public class Libro {

	private String nombre;
	private Integer tipo;
	private String editorial;
	private Integer a�o;
	private ArrayList<Autor> autor;

	public Libro() {
		super();
		this.nombre = "";
		this.tipo = 0;
		this.editorial = "";
		this.a�o = 0;
		this.autor = new ArrayList<>();
	}

	public Libro(String nombre, Integer tipo, String editorial, Integer a�o, ArrayList<Autor> autor) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.editorial = editorial;
		this.a�o = a�o;
		this.autor = new ArrayList<>();
		
		for (Autor Autor : autor) {
			this.autor.add(Autor.clone());
		}
	}
	
	public Libro clone() {

		Libro clonDeLibro = new Libro(this.nombre, this.tipo, this.editorial, this.a�o, this.autor);
		
		return clonDeLibro;
	}

	
	
	public Libro(Libro copiaLibro) {
		super();
		this.nombre = copiaLibro.nombre;
		this.tipo = copiaLibro.tipo;
		this.editorial = copiaLibro.editorial;
		this.a�o = copiaLibro.a�o;
		this.autor = new ArrayList<>();
		
		for (int i = 0; i < copiaLibro.autor.size(); i++) {			
			this.autor.add(copiaLibro.autor.get(i).clone());
		}
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Integer getA�o() {
		return a�o;
	}
	public void setA�o(Integer a�o) {
		this.a�o = a�o;
	}
	public ArrayList<Autor> getAutor() {
		return autor;
	}
	public void setAutor(ArrayList<Autor> autor) {
		this.autor = autor;
	}
	
	
}
