package ejercicio2;

public class Directivo extends Empleado {
	
	/**
	 * Constructor de la clase Directivo
	 * 
	 * @param nombre El nombre del directivo
	 */
	Directivo(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return super.toString() + " -> Directivo";
	}
}
