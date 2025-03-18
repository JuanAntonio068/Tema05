package ejercicio5;

public class Triangulo extends Poligono {

	private double lado1;

	private double lado2;

	private double lado3;

	public Triangulo(int lados) {
		super(lados);
		lado1 = 1;
		lado2 = 1;
		lado3 = 1;
	}

	public Triangulo(int lados, double lado1, double lado2, double lado3) {
		super(lados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

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
