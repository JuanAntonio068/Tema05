package ejercicio3;

public class Producto {

	private String nombre;

	private double precio;

	/**
	 * Constructor de la clase Productos
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 */
	public Producto(String nombre, double precio) {
		super();
		comprobarNombre(nombre);
		comprobarPrecio(precio);
	}

	/**
	 * Devuelve el nombre
	 * 
	 * @return El nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre del producto
	 * 
	 * @param nombre El nuevo nombre del producto
	 */
	public void setNombre(String nombre) {
		comprobarNombre(nombre);
	}

	/**
	 * Devuelve el precio
	 * 
	 * @return El precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Modifica el precio
	 * 
	 * @param precio El nuevo precio del producto
	 */
	public void setPrecio(double precio) {
		comprobarPrecio(precio);
	}

	/**
	 * Función para comprobar que el nombre es correcto
	 * 
	 * @param nombre El nombre a comprobar
	 * @return Devuelve true si es correcto y false si no
	 */
	public boolean comprobarNombre(String nombre) {
		boolean res = false;

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
			res = true;
		}
		return res;
	}

	/**
	 * Función para comprobar que el precio es correcto
	 * 
	 * @param precio El precio a comprobar
	 * @return Devuelve true si es correcto y false si no
	 */
	public boolean comprobarPrecio(double precio) {
		boolean res = false;

		if (precio > 0) {
			this.precio = precio;
			res = true;
		}
		return res;
	}

	public double calcular(int cantidad) {

		return this.precio * cantidad;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.nombre + "\n" + "Precio: " + this.precio + "\n";
	}
}
