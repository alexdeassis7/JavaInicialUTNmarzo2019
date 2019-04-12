package claseRepaso.utn.com;

import java.util.ArrayList;

public class AppMain {

	public static void main(String[] args) {

		ArrayList<Trabajador> trabajadores = new ArrayList<>();

		// intanciamos 3 objetos de tipo trabajador
		Trabajador t1 = new Trabajador();
		Trabajador t2 = new Trabajador();
		Trabajador t3 = new Trabajador();

		trabajadores.add(t1);
		trabajadores.add(t2);
		trabajadores.add(t3);

		for (int i = 0; i < 3; i++) {

			trabajadores.get(i).SolicitarDatos();

		}
		for (int i = 0; i < 3; i++) {

			System.out.println(trabajadores.get(i).toString());

		}
		// for (Trabajador trabajadorAuxiliar : trabajadores) {
		//
		// System.out.println(trabajadorAuxiliar.toString());
		//
		// }

	}

}
