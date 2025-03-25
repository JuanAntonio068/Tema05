package interfaces.ejercicio2;

import java.util.Arrays;

public class FutbolistaPrincipal {

	public static void main(String[] args) {

		// Creamos un array de futbolistas
		Futbolista futbolistas[] = new Futbolista[] { new Futbolista(1, "Juan", 20, 30),
				new Futbolista(1, "Adrian", 30, 2), new Futbolista(4, "Pedro", 29, 5),
				new Futbolista(3, "Pepito", 39, 40), new Futbolista(2, "Jorge", 40, 50) };

		// Lo ordenamos
		Arrays.sort(futbolistas);

		// Lo imprimimos
		System.out.println(Arrays.deepToString(futbolistas));
	}

}
