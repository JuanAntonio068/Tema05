package ejercicio5;

/**
 * Clase que representa un traingulo
 */
public class Triangulo extends Poligono {

	// Un lado
	private double lado1;

	// Otro lado
	private double lado2;

	// Otro lado
	private double lado3;

	/**
	 * Constructor de la clase triangulo
	 * 
	 * @param lados El número de lados
	 */
	public Triangulo(int lados) {
		super(lados);
		lado1 = 1;
		lado2 = 1;
		lado3 = 1;
	}

	/**
	 * Constructor de la clase triangulo
	 * 
	 * @param lados El número de lados
	 * @param lado1 El primer lado del triangulo
	 * @param lado2 El segundo lado del triangulo
	 * @param lado3 El tercer lado del triangulo
	 */
	public Triangulo(int lados, double lado1, double lado2, double lado3) {
		super(lados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
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

	/**
	 * Devuelve el tercer lado
	 * 
	 * @return EL tercer lado del rectangulo
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * Modifica el tercer lado
	 * 
	 * @param lado2 El nuevo lado del rectangulo
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public String toString() {
		return "Triángulo \n" + "Lado 1: " + this.lado1 + "\n" + "Lado 2: " + this.lado2 + "\n" + "Lado 3: "
				+ this.lado3 + "\n" + "Área: " + area() + "\n";
	}

	@Override
	public double area() {
		double s;

		s = (lado1 + lado2 + lado3) / 2;

		return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	}
}
