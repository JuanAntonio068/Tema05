package ejercicio1;

public class HoraExacta extends Hora {

	private int segundos;

	/**
	 * Constructor de la clase horaExacta
	 * 
	 * @param hora     Hora del reloj
	 * @param minutos  minutos del reloj
	 * @param segundos segundos del reloj
	 */
	HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		compruebaSegundos(segundos);
	}

	/**
	 * Función para asignar un valor a los segundos
	 * 
	 * @aram valor El nuevo valor de los segundos
	 * @return Se devuelve true si ha sido posible el cambio y false si no
	 */
	public boolean setSegundo(int valor) {

		return compruebaSegundos(valor);
	}

	@Override
	public void inc() {
		this.segundos++;

		if (segundos >= 60) {
			minutos++;
			segundos = 0;
		}
		super.inc();
	}

	/**
	 * Función para comprobar los segundos
	 * 
	 * @param segundos segundos del reloj
	 * @return Devuelve true si los segundos son correctos y false si no
	 */
	public boolean compruebaSegundos(int segundos) {
		boolean res = false;

		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
			res = true;
		}
		return res;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ":" + this.segundos;
	}
}
