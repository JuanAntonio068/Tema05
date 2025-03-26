package analisis.ejercicio2;

public class Revista extends Ficha {

	private String info;

	private int año;

	/**
	 * Constructor de la clase revista
	 * 
	 * @param id     id de la revista
	 * @param titulo titulo de la revista
	 * @param info   indormacion sobre la revista
	 * @param año    el año cuando se publicó la revista
	 */
	public Revista(int id, String titulo, String info, int año) {
		super(id, titulo);

		if (info != null && !info.isBlank())
			this.info = info;

		this.año = año;
	}

	/**
	 * Devuelve la información
	 * 
	 * @return la información de la revista
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * Modifica la información
	 * 
	 * @param info la nueva información de la revista
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 * Devuelve el año
	 * 
	 * @return el año cuando se publicó la revista
	 */
	public int getAño() {
		return año;
	}

	@Override
	public String prestar() {
		return "La revista se ha prestado por 10 días";
	}
}
