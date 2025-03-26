package analisis.ejercicio4;

public class Contacto {

	private String nombre;

	private int telf;

	/**
	 * Constructor de la clase contacto
	 * 
	 * @param nombre nombre del contacto
	 * @param telf   telefono del contacto
	 */
	public Contacto(String nombre, int telf) {
		if (nombre != null && !nombre.isBlank())
			this.nombre = nombre;

		if (telf > 0)
			this.telf = telf;
	}

	/**
	 * Devuelve el nombre
	 * 
	 * @return El nombre del contacto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre
	 * 
	 * @param nombre el nuevo nombre del contacto
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank())
			this.nombre = nombre;
	}

	/**
	 * Devuelve el teléfono
	 * 
	 * @return el teléfono del contacto
	 */
	public int getTelf() {
		return telf;
	}

	/**
	 * Modifica el teléfono
	 * 
	 * @param telf el nuevo teléfono del contacto
	 */
	public void setTelf(int telf) {
		if (telf > 0)
			this.telf = telf;
	}

	@Override
	public boolean equals(Object obj) {

		Contacto c = (Contacto) obj;

		return this.nombre.equals(c.nombre);
	}
}
