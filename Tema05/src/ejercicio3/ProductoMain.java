package ejercicio3;

public class ProductoMain {

	public static void main(String[] args) {

		Producto Pr1 = new Producto("Pizza", 10.99);
		Perecedero Pe1 = new Perecedero("Hamburguesa", 10.99, 1);
		NoPerecedero NPe1 = new NoPerecedero("Televisión", 500, "Eléctronica");
		
		System.out.println(Pr1);
		System.out.println(Pe1);
		System.out.println(NPe1);
		
		System.out.println(Pr1.calcular(4));
		System.out.println(Pe1.calcular(4));
		System.out.println(NPe1.calcular(6));
	}

}
