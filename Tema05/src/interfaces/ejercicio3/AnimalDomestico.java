package interfaces.ejercicio3;

public abstract class AnimalDomestico implements Animal {

	private String nombre;

	private String raza;

	private double peso;

	private String color;

	public void vacunar() {

	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub

	}

	@Override
	public abstract void hacerRuido();

	public abstract boolean hacerCaso();
}
