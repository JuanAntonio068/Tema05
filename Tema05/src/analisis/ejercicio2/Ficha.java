package analisis.ejercicio2;

public abstract class Ficha {

	private int id;

	private String titulo;

	/**
	 * Constructor de la clase ficha
	 * 
	 * @param id     id del objeto
	 * @param titulo titulo del objeto
	 */
	public Ficha(int id, String titulo) {
		if (id > 0) {
			this.id = id;
		}

		if (titulo != null && !titulo.isBlank())
			this.titulo = titulo;
	}

	/**
	 * Devuelve el id
	 * 
	 * @return el id del objeto
	 */
	public int getId() {
		return id;
	}

	/**
	 * Devuelve el titulo
	 * 
	 * @return el titulo del objeto
	 */
	public String getTitulo() {
		return titulo;
	}

	public abstract String prestar();
}
