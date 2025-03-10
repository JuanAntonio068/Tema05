package ejercicio3;

public class Perecedero extends Producto {

	private int diasACaducar;

	/**
	 * Constructor de la clase Perecedero
	 * 
	 * @param nombre       nombre del producto
	 * @param precio       precio del producto
	 * @param diasACaducar Dias que faltan para que caduque el productos
	 */
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		compruebaDias(diasACaducar);
	}

	/**
	 * Devuelve los días que faltan para que caduque
	 * 
	 * @return Dias que faltan para que caduque el productos
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * Modifica los dias a caducar
	 * 
	 * @param diasACaducar Los nuevos dias a caducar
	 */
	public void setDiasACaducar(int diasACaducar) {
		compruebaDias(diasACaducar);
	}

	/**
	 * Comprueba que el valor introducido es correcto
	 * 
	 * @param diasACaducar los dias a caducar del producto
	 * @return Devuelve true si es correcto y false si no
	 */
	public boolean compruebaDias(int diasACaducar) {
		boolean res = false;

		if (diasACaducar > 0) {
			this.diasACaducar = diasACaducar;
			res = true;
		}
		return res;
	}

	@Override
	public double calcular(int cantidad) {

		double calculo;

		if (diasACaducar == 1) {
			calculo = (super.calcular(cantidad)) / 4;
		} else if (diasACaducar == 2) {
			calculo = (super.calcular(cantidad)) / 3;
		} else if (diasACaducar == 3) {
			calculo = (super.calcular(cantidad)) / 2;
		} else {
			calculo = super.calcular(cantidad);
		}

		return calculo;
	}

	@Override
	public String toString() {
		return super.toString() + "Dias a caducar: " + this.diasACaducar + "\n";
	}
}
