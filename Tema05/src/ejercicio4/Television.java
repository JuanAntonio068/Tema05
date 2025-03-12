package ejercicio4;

public class Television extends Electrodomestico {

	private int resolucion = 20;

	private boolean sintonizadorTDT = false;

	/**
	 * Constructor de la clase Television
	 * 
	 * @param precio Precio de la televisión
	 * @param peso   Peso de la televisión
	 */
	public Television(double precio, double peso) {
		super(precio, peso);
	}

	/**
	 * Constructor de la clase Television
	 * 
	 * @param precio          Precio de la televisión
	 * @param color           Color de la televisión
	 * @param letra           Consumo energético de la televisión
	 * @param peso            Peso de la televisión
	 * @param resolucion      Resolución de la televisión
	 * @param sintonizadorTDT El sintonizador de la televisión
	 */
	public Television(double precio, String color, char letra, double peso, int resolucion, boolean sintonizadorTDT) {
		super(precio, color, letra, peso);

		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * Devuelve si tiene sintonizador TDT
	 * 
	 * @return Si la televisión tiene sintonizador TDT devuelve true
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * Modifica si tiene sintonizador TDT
	 * 
	 * @param sintonizadorTDT de la telecisión
	 */
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * Devuelve la resolución
	 * 
	 * @return La resolución de la televisión
	 */
	public int getResolucion() {
		return resolucion;
	}

	@Override
	public void precioFinal() {

		super.precioFinal();

		if (this.resolucion > 40) {
			this.precio += (this.precio * 30) / 100;
		}
		if (this.sintonizadorTDT) {
			this.precio += 50;
		}
	}
}
