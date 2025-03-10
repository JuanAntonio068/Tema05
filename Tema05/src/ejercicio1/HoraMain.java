package ejercicio1;

public class HoraMain {

	public static void main(String[] args) {

		Hora h1 = new Hora(2, 9);
		
		HoraExacta h2 = new HoraExacta(5, 59, 59);
		
		h1.inc();
		
		h2.inc();
		
		System.out.println(h1);
		
		System.out.println();
		
		System.out.println(h2);
	}

}
