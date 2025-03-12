package ejercicio4;

public class Lavadora extends Electrodomestico {

	private double carga = 5;

	/**
	 * Constructor de la clase Lavadora
	 * 
	 * @param precio Precio de la lavadora
	 * @param peso   Peso de la lavadora
	 */
	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}

	/**
	 * Constructor de la clase Lavadora
	 * 
	 * @param precio Precio de la lavadora
	 * @param color  Color de la lavadora
	 * @param letra  Consumo enérgetico de la lavadora
	 * @param peso   Peso de la lavadora
	 * @param carga  Carga de la lavadora
	 */
	public Lavadora(double precio, String color, char letra, double peso, double carga) {
		super(precio, color, letra, peso);

		if (carga > 0) {
			this.carga = carga;
		}
	}

	/**
	 * Devuelve la carga
	 * 
	 * @return La carga de la lavadora
	 */
	public double getCarga() {
		return carga;
	}

	@Override
	public void precioFinal(){
		super.precioFinal();
		
		if(this.carga > 30) {
			this.precio += 50;
		}
	}
}
