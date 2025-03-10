package ejercicio3;

public class NoPerecedero extends Producto {

	private String tipo;

	/**
	 * Constructor de la clase NoPerecedero
	 * 
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 * @param tipo   tipo del producto
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		comprobarTipo(tipo);
	}

	/**
	 * Devuelve el tipo
	 * 
	 * @return El tipo del producto
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Modifica el valor de tipo
	 * 
	 * @param tipo El nuevo tipo
	 */
	public void setTipo(String tipo) {
		comprobarTipo(tipo);
	}

	@Override
	public double calcular(int cantidad) {
		return super.calcular(cantidad);
	}

	/**
	 * Función para comprobar que el tipo sea correcto
	 * 
	 * @param tipo El tipo del producto
	 * @return Devuelve true si es correcto y false si no
	 */
	public boolean comprobarTipo(String tipo) {

		boolean res = false;

		if (tipo != null && !tipo.isBlank()) {
			this.tipo = tipo;
			res = true;
		}
		return res;
	}

	@Override
	public String toString() {
		return super.toString() + "Tipo " + this.tipo + "\n";
	}
}
