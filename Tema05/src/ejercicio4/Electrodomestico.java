package ejercicio4;

public class Electrodomestico {

	protected double precio = 100;

	protected Color color = Color.BLANCO;

	protected ConsumoEnergetico consumo = ConsumoEnergetico.F;

	protected double peso = 5;

	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Construcctor para la clase electrodomestico
	 * 
	 * @param precio Precio del electrodomestico
	 * @param peso   peso del electrodomestico
	 */
	public Electrodomestico(double precio, double peso) {

		if (precio > 0) {
			this.precio = precio;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor de la clase Electrodomestico
	 * 
	 * @param precio Precio del Electrodomestico
	 * @param color  Color del Electrodomestico
	 * @param letra  Consumo del Electrodomestico
	 * @param peso   Peso del Electrodomestico
	 */
	public Electrodomestico(double precio, String color, char letra, double peso) {
		if (precio > 0) {
			this.precio = precio;
		}
		if (peso > 0) {
			this.peso = peso;
		}
		comprobarColor(color);

		comprobarConsumoEnergetico(letra);
	}

	/**
	 * Devuelve el precio
	 * 
	 * @return El precio del electrodomestico
	 */
	public double getPrecioBase() {
		return precio;
	}

	/**
	 * Modifica el precio
	 * 
	 * @param precioBase El nuevo precio del electrodomestico
	 */
	public void setPrecioBase(double precioBase) {
		if (precio > 0) {
			this.precio = precioBase;
		}
	}

	/**
	 * Devuelve el color
	 * 
	 * @return El color del electrodomestico
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Modifica el color
	 * 
	 * @param color El nuevo color del electrodomestico
	 */
	public void setColor(String color) {
		comprobarColor(color);
	}

	/**
	 * Devuelve el consumo
	 * 
	 * @return El consumo enérgetico del electrodomestico
	 */
	public ConsumoEnergetico getConsumo() {
		return consumo;
	}

	/**
	 * Devuelve el peso
	 * 
	 * @return El peso del electrodomestico
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Método para comprobar que el consumo energético es correcto
	 * 
	 * @param letra El consumo enérgetico a comprobar
	 */
	private void comprobarConsumoEnergetico(char letra) {

		switch (letra) {
		case 'A' -> this.consumo = ConsumoEnergetico.A;

		case 'B' -> this.consumo = ConsumoEnergetico.B;

		case 'C' -> this.consumo = ConsumoEnergetico.C;

		case 'D' -> this.consumo = ConsumoEnergetico.D;

		case 'E' -> this.consumo = ConsumoEnergetico.E;

		default -> this.consumo = ConsumoEnergetico.F;
		}
	}

	/**
	 * Método para comprobar que el color es correcto
	 * 
	 * @param letra El consumo enérgetico a comprobar
	 */
	private void comprobarColor(String color) {
		switch (color) {
		case "NEGRO" -> this.color = Color.valueOf(color);

		case "ROJO" -> this.color = Color.valueOf(color);

		case "AZUL" -> this.color = Color.valueOf(color);

		case "GRIS" -> this.color = Color.valueOf(color);

		default -> this.color = Color.BLANCO;
		}
	}

	/**
	 * Método para obtener el precio final
	 */
	public void precioFinal() {

		switch (this.consumo) {
		case A -> this.precio += 100;

		case B -> this.precio += 80;

		case C -> this.precio += 60;

		case D -> this.precio += 50;

		case E -> this.precio += 30;

		case F -> this.precio += 10;
		}

		if (this.peso > 0 && this.peso <= 19) {

			this.precio += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {

			this.precio += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {

			this.precio += 80;
		} else {

			this.precio += 100;
		}
	}
}
