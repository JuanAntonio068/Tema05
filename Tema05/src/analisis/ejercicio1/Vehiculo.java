package analisis.ejercicio1;

public class Vehiculo {

	private String marca;

	private String modelo;

	private String color;

	private boolean motor = false;

	private int marcha = 0;

	private int velocidad = 0;

	/**
	 * Constructor de la clase vehiculo
	 * 
	 * @param marca  marca del vehiculo
	 * @param modelo modelo del vehiculo
	 * @param color  color del vehiculo
	 */
	public Vehiculo(String marca, String modelo, String color) {

		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
	}

	/**
	 * Devuelve la marca
	 * 
	 * @return la marca del coche
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Devuelve el modelo
	 * 
	 * @return el modelo del coche
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Devuelve el color
	 * 
	 * @return el color del coche
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Método para parar el coche
	 */
	public boolean parar() {

		boolean res = false;

		if (velocidad == 0) {
			this.motor = false;
			res = true;
		}
		return res;

	}

	/**
	 * Método para arrancar el coche
	 */
	public boolean arrancar() {
		boolean res = false;

		if (!motor) {
			this.motor = true;
			res = true;
		}
		return res;
	}

	public boolean subirMarcha(int velocidad) {

		boolean res = false;
		if (motor) {
			if (velocidad > this.velocidad) {
				if (velocidad > 0 && velocidad < 30) {
					if (marcha != 1) {
						marcha = 1;
						res = true;
					}
				} else if (velocidad >= 30 && velocidad < 50) {
					if (marcha != 2) {
						marcha = 2;
						res = true;
					}
				} else if (velocidad >= 50 && velocidad < 70) {
					if (marcha != 3) {
						marcha = 3;
						res = true;
					}
				} else if (velocidad >= 70 && velocidad < 100) {
					if (marcha != 4) {
						marcha = 4;
						res = true;
					}
				} else {
					if (marcha != 5) {
						marcha = 5;
						res = true;
					}
				}
			}
		}
		return res;
	}

	public boolean bajarMarcha(int velocidad) {

		boolean res = false;
		if (motor) {
			if (velocidad < this.velocidad) {
				if (velocidad > 0 && velocidad < 30) {
					if (marcha != 1) {
						marcha = 1;
						res = true;
					}
				} else if (velocidad >= 30 && velocidad < 50) {
					if (marcha != 2) {
						marcha = 2;
						res = true;
					}
				} else if (velocidad >= 50 && velocidad < 70) {
					if (marcha != 3) {
						marcha = 3;
						res = true;
					}
				} else if (velocidad >= 70 && velocidad < 100) {
					if (marcha != 4) {
						marcha = 4;
						res = true;
					}
				} else {
					if (marcha != 5) {
						marcha = 5;
						res = true;
					}
				}
			}
		}
		return res;
	}
}
