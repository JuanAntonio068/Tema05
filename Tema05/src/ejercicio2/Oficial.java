package ejercicio2;

public class Oficial extends Operario{

	/**
	 * Constructor de la clase Operario
	 * 
	 * @param nombre El nombre del oficial
	 */
	Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}
}
