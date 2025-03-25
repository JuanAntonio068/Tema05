package analisis.ejercicio1;

public class Turismo extends Vehiculo {

	private int numPlazas;

	private Tipo uso;

	enum Tipo {
		PROFESIONAL, PARTICULAR
	}

	/**
	 * Constructor de la clase turismo
	 * 
	 * @param marca  marca del turismo
	 * @param modelo modelo del turismo
	 * @param color  color del turismo
	 */
	public Turismo(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}

	/**
	 * Constructor de la clase turismo
	 * 
	 * @param marca     marca del turismo
	 * @param modelo    modelo del turismo
	 * @param color     color del turismo
	 * @param numPlazas El número de plazas del turismo
	 * @param uso       el uso del turismo
	 */
	public Turismo(String marca, String modelo, String color, int numPlazas, String uso) {
		super(marca, modelo, color);

		if (numPlazas >= 2) {
			this.numPlazas = numPlazas;
		}
		switch (uso) {
		case "PROFESIONAL" -> this.uso = Tipo.PROFESIONAL;

		default -> this.uso = Tipo.PARTICULAR;
		}
	}
	
}
