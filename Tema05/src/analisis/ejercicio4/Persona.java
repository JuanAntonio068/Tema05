package analisis.ejercicio4;

public class Persona extends Contacto {

	private String cumple;

	/**
	 * Constructor de la clase persona
	 * 
	 * @param nombre nombre de la persona
	 * @param telf   teléfono de la persona
	 * @param cumple cumpleaños de la persona
	 */
	public Persona(String nombre, int telf, String cumple) {
		super(nombre, telf);

		if (cumple != null && !cumple.isBlank())
			this.cumple = cumple;
	}

	/**
	 * Devuelve el cumple
	 * 
	 * @return el cumpleaños de la persona
	 */
	public String getCumple() {
		return cumple;
	}

}
