package ejercicio2;

public class Empleado {

	private String nombre;

	/**
	 * Constructor de la clase empleado
	 * 
	 * @param nombre Nombre del empleados
	 */
	Empleado(String nombre) {
		comprobarNombre(nombre);
	}

	/**
	 * Función para modificar el nombre del empleado
	 * 
	 * @param nombre El nuevo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Función para obtener el nombre
	 * 
	 * @return El nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	public boolean comprobarNombre(String nombre) {
		boolean res = false;

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
			res = true;
		}
		return res;
	}

	@Override
	public String toString() {

		return "Empleado " + this.nombre;
	}
}
