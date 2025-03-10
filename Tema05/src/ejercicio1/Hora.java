package ejercicio1;

public class Hora {

	protected int hora;

	protected int minutos;

	/**
	 * Constructor de la clase hora
	 * 
	 * @param hora    Hora del reloj
	 * @param minutos Minutos del reloj
	 */
	Hora(int hora, int minutos) {

		compruebaHora(hora);
		compruebaMinutos(minutos);
	}

	/**
	 * Incrementa la hora en un minuto
	 */
	public void inc() {

		this.minutos++;
		if (minutos >= 60) {
			this.hora++;
			minutos = 0;
		}
	}

	/**
	 * Función para cambiar el valor de los minutos
	 * 
	 * @param valor El nuevo valor de los minutos
	 * @return Se devuelve true si ha sido posible el cambio y false si no
	 */
	public boolean setMinutos(int valor) {

		return compruebaMinutos(valor);
	}

	/**
	 * Función para cambiar el valor de las horas
	 * 
	 * @param valor El nuevo valor de las horas
	 * @return Se devuelve true si ha sido posible el cambio y false si no
	 */
	public boolean setHora(int valor) {

		return compruebaHora(valor);
	}

	/**
	 * Comprueba que la hora sea correcta
	 * 
	 * @param hora hora del reloj
	 */
	private boolean compruebaHora(int hora) {

		boolean res = false;

		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
			res = true;
		}
		return res;
	}

	/**
	 * Comprueba que los minutos sean correctos
	 * 
	 * @param minutos Minutos del reloj
	 */
	private boolean compruebaMinutos(int minutos) {

		boolean res = false;

		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
			res = true;
		}
		return res;
	}

	@Override
	public String toString() {

		return this.hora + ":" + this.minutos;
	}
}
