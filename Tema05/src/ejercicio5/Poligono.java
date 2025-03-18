package ejercicio5;

/**
 * Clase que representa un poligono
 */
public abstract class Poligono {

	// El número de lados del polígono
	private int numeroaLados;

	/**
	 * Construcot de la clase Poligono
	 * 
	 * @param lados El número de lados del polígono
	 */
	public Poligono(int lados) {
		if (lados > 0) {
			this.numeroaLados = lados;
		}
	}

	/**
	 * Devuelve el número de lados
	 * 
	 * @return El número de lados del polígono
	 */
	public int getNumeroaLados() {
		return numeroaLados;
	}

	/**
	 * Devuelve la cadena
	 */
	@Override
	public String toString() {
		return "Lados: " + this.numeroaLados;
	}

	/**
	 * Método abstracto para calcular el área
	 * 
	 * @return El área del polígono
	 */
	public abstract double area();
}
