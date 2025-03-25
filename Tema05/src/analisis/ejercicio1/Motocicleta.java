package analisis.ejercicio1;

public class Motocicleta extends Vehiculo {

	private int cilindrada;

	/**
	 * Constructor de la clase Motocilceta
	 * 
	 * @param marca  marca de la moto
	 * @param modelo modelo de la moto
	 * @param color  color de la moto
	 */
	public Motocicleta(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}

	/**
	 * Constructor de la clase Motocilceta
	 * 
	 * @param marca      marca de la moto
	 * @param modelo     modelo de la moto
	 * @param color      color de la moto
	 * @param cilindrada cilindrada del motor de la moto
	 */
	public Motocicleta(String marca, String modelo, String color, int cilindrada) {
		super(marca, modelo, color);
		this.cilindrada = cilindrada;
	}

	public boolean requiereCarnet() {
		
		return this.cilindrada >= 125;	
	}
}
