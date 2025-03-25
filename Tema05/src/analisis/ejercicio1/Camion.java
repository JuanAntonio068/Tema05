package analisis.ejercicio1;

public class Camion extends Vehiculo {

	private double pesoMaximo;

	private boolean mercanciaPeligrosa;

	/**
	 * Constructor de la clase camion
	 * 
	 * @param marca  marca del camion
	 * @param modelo modelo del camion
	 * @param color  color del camion
	 */
	public Camion(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}

	/**
	 * Constructor de la clase camion
	 * 
	 * @param marca              marca del camion
	 * @param modelo             modelo del camion
	 * @param color              color del camion
	 * @param pesoMaximo         peso maximo del camion
	 * @param mercanciaPeligrosa Si el camion lleva mercancia peligrosa
	 */
	public Camion(String marca, String modelo, String color, double pesoMaximo, boolean mercanciaPeligrosa) {
		super(marca, modelo, color);

		if (pesoMaximo > 100) {
			this.pesoMaximo = pesoMaximo;
		}
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

}
