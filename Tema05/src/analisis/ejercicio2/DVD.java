package analisis.ejercicio2;

public class DVD extends Ficha {

	private String director;

	private int año;

	private Tipo tipo;

	enum Tipo {
		PELICULA, DOCUMENTAL, SERIE
	}

	/**
	 * Constructor de la clase DVD
	 * 
	 * @param id       id del DVD
	 * @param titulo   titulo del DVD
	 * @param director director del DVD
	 * @param año      el año cuando se publicó el DVD
	 * @param tipo     el tipo del DVD
	 */
	public DVD(int id, String titulo, String director, int año, String tipo) {
		super(id, titulo);

		if (director != null && !director.isBlank())
			this.director = director;

		this.año = año;

		switch (tipo) {
		case "SERIE", "DOCUMENTAL" -> this.tipo = Tipo.valueOf(tipo);

		default -> this.tipo = Tipo.PELICULA;
		}
	}

	/**
	 * Devuelve el director
	 * 
	 * @return el director del DVD
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * Devuelve el año
	 * 
	 * @return el año cuando se publicó el DVD
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Devuelve el tipo
	 * 
	 * @return el tipo del DVD
	 */
	public Tipo getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + "\n Título: " + getTitulo() + "\n Director: " + director + "\n Año: " + año
				+ "\n Tipo: " + tipo + "\n";
	}

	@Override
	public String prestar() {
		return "El DVD se ha prestado por 5 días";
	}
}
