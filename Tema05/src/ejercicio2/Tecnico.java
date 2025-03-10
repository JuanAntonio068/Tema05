package ejercicio2;

public class Tecnico extends Operario{

	/**
	 * Constructor de la clase Tecnico
	 * 
	 * @param nombre El nombre del tecnico
	 */
	Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Tecnico";
	}
}
