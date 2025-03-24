package interfaces.ejercicio2;

public class Futbolista {

	// El número de la camiseta del futbolista
	private int numCamiseta;

	// El nombre del futbolista
	private String nombre;

	// La edad del futbolista
	private int edad;

	// Los goles que ha metido el futbolista
	private int numGoles;

	/**
	 * Construcotr de la clase futbolista
	 * 
	 * @param numCamiseta El número de la camiseta del futbolista
	 * @param nombre      El nombre del futbolista
	 * @param edad        La edad del futbolista
	 * @param numGoles    Los goles que ha metido el futbolista
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (edad > 0) {
			this.edad = edad;
		}
		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
	}

	/**
	 * Devuelve el número de la camiseta
	 * 
	 * @return El número de la camiseta del jugador
	 */
	public int getNumCamiseta() {
		return numCamiseta;
	}

	/**
	 * Modifica el número de la camiseta
	 * 
	 * @param numCamiseta El nuevo numero
	 */
	public void setNumCamiseta(int numCamiseta) {
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}
	}

	/**
	 * Devuelve el nombre 
	 * @return El nombre del jugadro
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre 
	 * @param nombre El nuevo nombre
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Devuelve la edad
	 * @return La edad del futbolista
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * 
	 * @return
	 */
	public int getNumGoles() {
		return numGoles;
	}

}
