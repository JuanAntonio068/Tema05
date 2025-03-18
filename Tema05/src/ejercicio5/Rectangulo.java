package ejercicio5;

/**
 * Clase que representa un rectangulo
 */
public class Rectangulo extends Poligono {

	// Un lado del rectangulo
	private double lado1;

	// Otro lado del rectangulo
	private double lado2;

	/**
	 * Constructor de la clase Rectangulo
	 * 
	 * @param lados El número de lados del rectangulo
	 */
	public Rectangulo(int lados) {
		super(lados);
		lado1 = 1;
		lado2 = 1;
	}

	/**
	 * Constructor de la clase Rectangulo
	 * 
	 * @param lados El número de lados del rectangulo
	 * @param lado1 Un lado del rectangulo
	 * @param lado2 Otro lado del rectangulo
	 */
	public Rectangulo(int lados, double lado1, double lado2) {
		super(lados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	/**
	 * Devuele el primer lado
	 * 
	 * @return El primer lado del rectángulo
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Modifica el primer lado
	 * 
	 * @param lado1 El nuevo lado del rectangulo
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Devuelve el segundo lado
	 * 
	 * @return EL segundo lado del rectangulo
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Modifica el segundo lado
	 * 
	 * @param lado2 El nuevo lado del rectangulo
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public String toString() {
		return "Rectangulo \n" + "Lado 1: " + this.lado1 + "\n" + "Lado 2: " + this.lado2 + "\n" + "Área: " + area()
				+ "\n";
	}

	@Override
	public double area() {
		return this.lado1 * this.lado2;
	}

}
