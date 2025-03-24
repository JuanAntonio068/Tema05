package interfaces.ejercicio1;

public class Socio implements Comparable<Socio> {

	// Número identificativo del socio
	private int id;

	// Nombre del socio
	private String nombre;

	// Edad del socio
	private int edad;

	/**
	 * Constructor de la clase socio
	 * 
	 * @param id id del socio
	 */
	public Socio(int id) {
		if (id > 0) {
			this.id = id;
		}
	}

	/**
	 * Constructor de la clase socio
	 * 
	 * @param id     id del socio
	 * @param nombre nombre del socio
	 * @param edad   edad del socio
	 */
	public Socio(int id, String nombre, int edad) {
		if (id > 0) {
			this.id = id;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Devuelve el nombre
	 * 
	 * @return El nomobre del socio
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre
	 * 
	 * @param nombre El nuevo nombre del socio
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Devuelve el id
	 * 
	 * @return el id del socio
	 */
	public int getId() {
		return id;
	}

	/**
	 * Devuelve la edad
	 * 
	 * @return la edad del socio
	 */
	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "ID: " + this.id + "\n Nombre: " + this.nombre + "\n Edad: " + this.edad + "\n";
	}

	public int compareTo(Socio s1) {
		int res = 0;
		if (this.id < s1.id) {
			res = -1;
		} else if (this.id > s1.id) {
			res = 1;
		}
		return res;
	}

}
