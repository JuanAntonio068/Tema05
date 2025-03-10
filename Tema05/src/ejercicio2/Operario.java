package ejercicio2;

public class Operario extends Empleado {

	/**
	 * Constructor de la clase operario
	 * 
	 * @param nombre El nombre del operario
	 */
	Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Operario";
	}
}
