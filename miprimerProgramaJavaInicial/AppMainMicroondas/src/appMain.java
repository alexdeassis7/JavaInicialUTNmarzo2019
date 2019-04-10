import java.util.Scanner;

public class appMain {

	public static void main(String[] args) {
		char crearNewOrden = 'Y';
		int opcion = 0;
		int tiempoMicro = 0;
		int cantPizzaMuzza = 0;
		int cantPizzaDobleQJ = 0;
		int cantPizzaVegetariana = 0;
		int cantMuzza = 0;
		int cantTomate = 0;
		int cantProvo = 0;
		int cantJamon = 0;
		int antAcelga = 0;
		int cantSalsa = 0;
		int cantQueso = 0;

		Scanner s1 = new Scanner(System.in);
		System.out.println("Desea hacer una nueva pizza?? (y / n)");
		crearNewOrden = s1.next().charAt(0);

		while (crearNewOrden == 'y' || crearNewOrden == 'Y') {
			System.out.println("****************************************");
			System.out.println("selecciones la opción deseada");
			System.out.println("1.Grande de Muzza");
			System.out.println("2.Doble Queso con jamon");
			System.out.println("3. Vegetariana");
			System.out.println("4. Finalizar Pedido");
			System.out.println("****************************************");
			opcion = s1.nextInt();

			switch (opcion) {
			case 1:
				GrandeMuzza muzza1 = new GrandeMuzza();
				tiempoMicro += muzza1.tiempo;
				cantMuzza += muzza1.mozzarella;
				cantTomate += muzza1.tomate;
				cantPizzaMuzza += 1;
				break;
			case 2:

				DobleQuesoJamon dqj1 = new DobleQuesoJamon();
				tiempoMicro += dqj1.tiempo;
				cantMuzza += dqj1.mozzarella;
				cantTomate += dqj1.tomate;
				cantProvo += dqj1.provolone;
				cantJamon += dqj1.jamon;
				cantPizzaDobleQJ += 1;

				break;
			case 3:

				break;
			case 4:
				System.out.println("");
				System.out.println("Pedido finalizado");
				System.out.println("");
				crearNewOrden = 'n';

				break;

			default:
				System.out.println("opcion no reconocida ");
				System.out.println("Decea hacer ordenar una  nueva pizza? (y/n)");
				crearNewOrden = s1.next().charAt(0);
				break;
			}
		}
		System.out.println(
				"############################################################################################");
		System.out
				.println("Cantidad de Pizzas Cocinadas: " + (cantPizzaMuzza + cantPizzaDobleQJ + cantPizzaVegetariana));

		if (cantPizzaMuzza >= 1) {
			System.out
					.println("Grande de Muzza: " + cantPizzaMuzza + ((int) cantPizzaMuzza == 1 ? " pizza" : " pizzas"));
		}

		if (cantPizzaDobleQJ >= 1) {
			System.out.println(
					"Doble Queso Jamon: " + cantPizzaDobleQJ + ((int) cantPizzaDobleQJ == 1 ? " pizza" : " pizzas"));
		}

		if (cantPizzaVegetariana >= 1) {
			System.out.println(
					"Vegetariana: " + cantPizzaVegetariana + ((int) cantPizzaVegetariana == 1 ? " pizza" : " pizzas"));
		}

		System.out.println("Tiempo insumido: " + tiempoMicro + " minutos");
		System.out.println("********************************************");
		System.out.println(
				"Cantidad de Muzzarella utilizada: " + cantMuzza + ((int) cantMuzza == 1 ? " unidad" : " unidades"));
		System.out.println(
				"Cantidad de Tomate utilizado: " + cantTomate + ((int) cantTomate == 1 ? " unidad" : " unidades"));
		System.out.println(
				"Cantidad de Provolone utilizado: " + cantProvo + ((int) cantProvo == 1 ? " unidad" : " unidades"));
		System.out.println(
				"Cantidad de Jamón utilizado: " + cantJamon + ((int) cantJamon == 1 ? " unidad" : " unidades"));
		System.out.println("Cantidad de Queso Rayado: " + cantQueso + ((int) cantQueso == 1 ? " unidad" : " unidades"));
		System.out.println("");
		System.out.println("Gracias por su orden!!!");

	}

}
