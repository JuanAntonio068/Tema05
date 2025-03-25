package interfaces.ejercicio3;

import java.util.Random;

public class Gato extends AnimalDomestico {

	@Override
	public void hacerRuido() {
		System.out.println("MIAU");
	}

	@Override
	public boolean hacerCaso() {
		Random rand = new Random();

		boolean res = false;

		int random = rand.nextInt(1, 11);

		res = switch (random) {

		case 1 -> res = true;

		default -> res = false;
		};

		return res;

	}

	public void toseBolaPelo() {

	}
}
