package ejercicio4;

import java.util.ArrayList;

public class ElectrodomesticoMain {

	public static void main(String[] args) {

		ArrayList<Electrodomestico> Electrodomesticos = new ArrayList<>();
		
		Electrodomestico E1 = new Electrodomestico(100, "NEGRO", 'A', 4);
		
		Electrodomestico E2 = new Electrodomestico(200, 50);
		
		Lavadora L1 = new Lavadora(300, "BLANCO", 'F', 100, 35);
		
		Lavadora L2 = new Lavadora(200, 20);
		
		Television T1 = new Television(500, "ROJO", 'D', 80, 50, true);
		
		Television T2 = new Television(300, 20);
		
		Electrodomesticos.add(E1);
		Electrodomesticos.add(E2);
		Electrodomesticos.add(L1);
		Electrodomesticos.add(L2);
		Electrodomesticos.add(T1);
		Electrodomesticos.add(T2);
	}

}
