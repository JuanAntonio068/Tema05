package ejercicio5;

public class Rectangulo extends Poligono {

	private double lado1;

	private double lado2;

	public Rectangulo(int lados) {
		super(lados);
		lado1 = 1;
		lado2 = 1;
	}

	public Rectangulo(int lados, double lado1, double lado2) {
		super(lados);
		this.lado1 = lado1;
		this.lado2 = lado2;
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

	@Override
	public String toString() {
		return "Rectangulo \n" + "Lado 1: " + this.lado1 + "\n" + "Lado 2: " + this.lado2 + "\n" + "Área: " + area() + "\n";
	}

	@Override
	public double area() {
		return this.lado1 * this.lado2;
	}

}
