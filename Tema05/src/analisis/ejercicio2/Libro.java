package analisis.ejercicio2;

public class Libro extends Ficha {

	private String autor;

	private String editorial;

	/**
	 * Constructor de la clase libro
	 * 
	 * @param id        id del libro
	 * @param titulo    titulo del libro
	 * @param autor     autor del libro
	 * @param editorial editorial del libro
	 */
	public Libro(int id, String titulo, String autor, String editorial) {
		super(id, titulo);

		if (autor != null && !autor.isBlank())
			this.autor = autor;

		if (editorial != null && !editorial.isBlank())
			this.editorial = editorial;
	}

	/**
	 * Devuelve el autor
	 * 
	 * @return el autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Devuelve la editorial
	 * 
	 * @return la editorial del libro
	 */
	public String getEditorial() {
		return editorial;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + "\n Título: " + getTitulo() + "\n Autor: " + autor + "\n Editorial: " + editorial + "\n";
	}

	@Override
	public String prestar() {

		return "El libro Se ha prestado por 15 días";
	}
}
