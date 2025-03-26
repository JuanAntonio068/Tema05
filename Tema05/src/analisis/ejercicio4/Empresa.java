package analisis.ejercicio4;

public class Empresa extends Contacto {

	private String web;

	/**
	 * Constructor de la clase empresa
	 * 
	 * @param nombre nombre de la empresa
	 * @param telf   teléfono de la empresa
	 * @param web    web de la empresa
	 */
	public Empresa(String nombre, int telf, String web) {
		super(nombre, telf);

		if (web != null && !web.isBlank())
			this.web = web;
	}

	/**
	 * Devuelve la web
	 * 
	 * @return la web de la empresas
	 */
	public String getWeb() {
		return web;
	}

	/**
	 * Modifica la web
	 * 
	 * @param web la nueva web de la empresa
	 */
	public void setWeb(String web) {
		this.web = web;
	}

}
