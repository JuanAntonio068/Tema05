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

	/**
	 * Devuelve si hay mercancia peligrosa
	 * 
	 * @return Si el camión tiene mercancia peligrosa
	 */
	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	/**
	 * Cambia si hay mercancía peligrosa
	 * 
	 * @param mercanciaPeligrosa el nuevo valor para saber si hay mercancia
	 *                           peligrosa
	 */
	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	/**
	 * Devuelve el peso máximo
	 * 
	 * @return el peso máximo del camión
	 */
	public double getPesoMaximo() {
		return pesoMaximo;
	}

}
