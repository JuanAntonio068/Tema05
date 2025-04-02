package comparator.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Principal {
	public static void main(String[] args) {
		// Crear una lista de 20 números aleatorios entre 1 y 100
		List<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			numeros.add(random.nextInt(1, 101));
		}

		// Imprimir la lista original
		System.out.println("Lista original:");
		System.out.println(numeros);

		// Salto de línea
		System.out.println();

		// Ordenar la lista en sentido decreciente usando la clase comparadora
		Collections.sort(numeros, new ComparadorDecreciente());

		// Imprimir la lista ordenada
		System.out.println("Lista ordenada en sentido decreciente:");
		System.out.println(numeros);
	}
}