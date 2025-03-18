package ejercicio5;

public abstract class Poligono {

	private int numeroaLados;

	public Poligono(int lados) {
		if (lados > 0) {
			this.numeroaLados = lados;
		}
	}

	public int getNumeroaLados() {
		return numeroaLados;
	}

	@Override
	public String toString() {
		return "Lados: " + this.numeroaLados;
	}
	
	public abstract double area();
}
