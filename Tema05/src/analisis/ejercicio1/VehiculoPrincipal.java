package analisis.ejercicio1;

public class VehiculoPrincipal {

	public static void main(String[] args) {

		Turismo t1 = new Turismo("Seat", "Ibiza", "Blanco", 5, "PARTICULAR");

		if (t1.arrancar()) {
			System.out.println("Se ha arrancado correctamente");
		}

		t1.subirMarcha(100);

		t1.bajarMarcha(0);
		
		if(t1.parar()) {
			System.out.println("Se ha parado correctamente");
		}
	}

}
