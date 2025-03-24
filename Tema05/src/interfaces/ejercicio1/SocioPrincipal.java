package interfaces.ejercicio1;

import java.util.Arrays;

public class SocioPrincipal {

	public static void main(String[] args) {

		// Creamos el array de socios
		Socio socios[] = new Socio[] { new Socio(1, "Juan", 19), new Socio(2, "Pedro", 20), new Socio(10, "Lucia", 39),
				new Socio(9, "Maria", 19), new Socio(5, "Marta", 21) };

		// Lo ordenamos
		Arrays.sort(socios);

		// Imprimimos el resultado
		System.out.println(Arrays.deepToString(socios));
	}

}
