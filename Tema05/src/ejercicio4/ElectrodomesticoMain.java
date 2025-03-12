package ejercicio4;

import java.util.ArrayList;

public class ElectrodomesticoMain {

	public static void main(String[] args) {

		// Lista donde se guardan todos los electrodomésticos
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

		// Declaramos el primer objeto tipo Electrodoméstico
		Electrodomestico E1 = new Electrodomestico(100, "NEGRO", 'A', 4);

		// Declaramos el segundo objeto tipo Electrodoméstico
		Electrodomestico E2 = new Electrodomestico(200, 50);

		// Declaramos el tercer objeto tipo Lavadora
		Lavadora L1 = new Lavadora(300, "BLANCO", 'F', 100, 35);

		// Declaramos el cuarto objeto tipo Lavadora
		Lavadora L2 = new Lavadora(200, 20);

		// Declaramos el quinto objeto tipo Televisión
		Television T1 = new Television(500, "ROJO", 'D', 80, 50, true);

		// Declaramos el quinto objeto tipo Televisión
		Television T2 = new Television(300, 20);

		// Variable para guardar el precio total de todos los electrodomésticos
		double total = 0;

		// Variable para guardar el precio total de todas las lavadoras
		double totalLavadoras = 0;

		// Variable para guardar el precio totoal de todas las televisiones
		double totalTele = 0;

		// Añadimos todos los objetos creados a la lista
		electrodomesticos.add(E1);
		electrodomesticos.add(E2);
		electrodomesticos.add(L1);
		electrodomesticos.add(L2);
		electrodomesticos.add(T1);
		electrodomesticos.add(T2);

		// For each para calcular el precio final de cada objeto
		for (Electrodomestico e : electrodomesticos) {
			e.precioFinal();
		}

		// Imprimimos todos los precios
		System.out.println(E1.precio + "€ \n");
		System.out.println(E2.precio + "€ \n");
		System.out.println(L1.precio + "€ \n");
		System.out.println(L2.precio + "€ \n");
		System.out.println(T1.precio + "€ \n");
		System.out.println(T2.precio + "€ \n");

		// For each para calcular los totales
		for (Electrodomestico e : electrodomesticos) {

			// El objeto es un electrodoméstico
			if (e instanceof Electrodomestico) {
				// Le sumamos el precio al total
				total += e.precio;
			}
			// El objeto es una lavadora
			if (e instanceof Lavadora) {
				// Le sumamos el precio al total
				totalLavadoras += e.precio;
			}
			// El objeto es una televisión
			if (e instanceof Television) {
				// Le sumamos el precio al total
				totalTele += e.precio;
			}

		}

		// Imprimimos el resultado
		System.out.println("Electrodomésticos: " + total + "\n");
		System.out.println("Lavadoras: " + totalLavadoras + "\n");
		System.out.println("Televisones: " + totalTele + "\n");

	}

}
