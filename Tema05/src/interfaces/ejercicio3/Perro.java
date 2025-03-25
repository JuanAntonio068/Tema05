package interfaces.ejercicio3;

import java.util.Random;

public class Perro extends AnimalDomestico {

	@Override
	public void hacerRuido() {

		System.out.println("GUAU");
	}

	@Override
	public boolean hacerCaso() {
		Random rand = new Random();

		boolean res = false;

		int random = rand.nextInt(1, 11);

		res = switch (random) {

		case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> res = true;

		default -> res = false;
		};

		return res;

	}

	public void sacarPaseo() {

	}
}
