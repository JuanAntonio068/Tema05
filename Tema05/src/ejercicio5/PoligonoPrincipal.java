package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class PoligonoPrincipal {

	static Scanner sc = new Scanner(System.in);

	private static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();

	public static void main(String[] args) {
		Rectangulo R1;

		Triangulo T1;

		int opcion;

		do {

			menu();
			opcion = sc.nextInt();

			switch (opcion) {
			case 1 -> {
				T1 = nuevoTriangulo();

				if (añadirPoligono(T1)) {
					System.out.println("Se ha añadido correctamente");
				} else {
					System.out.println("No se ha podido añadir");
				}
			}
			case 2 -> {
				R1 = nuevoRectangulo();

				if (añadirPoligono(R1)) {
					System.out.println("Se ha añadido correctamente");
				} else {
					System.out.println("No se ha podido añadir");
				}
			}
			case 3 -> {
				mostrarPoligonos();
			}
			case 0 -> {
				System.out.println("Saliendo...");
			}
			default -> {
				System.out.println("Opción incorrecta");
			}
			}
		} while (opcion != 0);
	}

	private static void menu() {
		System.out.println("1. Intoducir triángulo");
		System.out.println("2. Introducir Réctangulo");
		System.out.println("3. Mostrar polígonos");
		System.out.println("0. Salir");
	}

	private static Rectangulo nuevoRectangulo() {

		Rectangulo R1;

		int lados = 4;
		double lado1;
		double lado2;

		System.out.println("Introduce el primer lado");
		lado1 = sc.nextDouble();

		System.out.println("Introduce el segundo lado");
		lado2 = sc.nextDouble();

		sc.nextLine();

		R1 = new Rectangulo(lados, lado1, lado2);

		return R1;
	}

	private static Triangulo nuevoTriangulo() {

		Triangulo T1;

		int lados = 3;
		double lado1;
		double lado2;
		double lado3;

		System.out.println("Introduce el primer lado");
		lado1 = sc.nextDouble();

		System.out.println("Introduce el segundo lado");
		lado2 = sc.nextDouble();

		System.out.println("Introduce el tercer lado");
		lado3 = sc.nextDouble();

		sc.nextLine();

		T1 = new Triangulo(lados, lado1, lado2, lado3);

		return T1;
	}

	private static void mostrarPoligonos() {

		for (Poligono p : poligonos) {
			System.out.println(p);
		}
	}

	private static boolean añadirPoligono(Poligono p) {

		return poligonos.add(p);
	}
}
