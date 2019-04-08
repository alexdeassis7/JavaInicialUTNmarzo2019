package clase7Bis;

import java.util.ArrayList;

public class AppMainBis {

	public static void main(String[] args) {

		// defino una lista - colleccion de jugadores!
		ArrayList<JugadoresFutbol> jugadoresBarcelonaFC = new ArrayList<JugadoresFutbol>();

		JugadoresFutbol jugador1 = new JugadoresFutbol();
		JugadoresFutbol jugador2 = new JugadoresFutbol();
		JugadoresFutbol jugador3 = new JugadoresFutbol();

		jugador1.SolicitarDatosJugador();
		jugador2.SolicitarDatosJugador();
		jugador3.SolicitarDatosJugador();

		// add -Añade el elemento al Arralist
		jugadoresBarcelonaFC.add(jugador1);
		jugadoresBarcelonaFC.add(jugador2);
		jugadoresBarcelonaFC.add(jugador3);

		System.out.println("muestro mi ArraLis mediante un for Each");

		for (JugadoresFutbol jugadorVariableAuxiar : jugadoresBarcelonaFC) {
			System.out.println(jugadorVariableAuxiar.toString());

		}

		// size -Devuelve el numero de elementos del ArrayList
		System.out.println("cantidad de elemento de mi arraylist = " + jugadoresBarcelonaFC.size());

		// get - devuelve el elemento que esta ubicado en la posición '2' del ArrayList
		System.out.println("elemento del arraList en la posicion 0 =" + jugadoresBarcelonaFC.get(0));

		//// comprueba si existe el elemento que se le pasa por parametro
		System.out.println("comprueba si existe elemento 0 =" + jugadoresBarcelonaFC.contains(jugador1));

		// remove - borra el elemento de la posición '3' del ArrayList
		jugadoresBarcelonaFC.remove(3);

		// Clear - Borra todos los elementos del Array List
		System.out.println("vacio el array ");
		jugadoresBarcelonaFC.clear();
		System.out.println(jugadoresBarcelonaFC.size());

		// isEmpty - Devuelve true si el ArraiLis Esta Vacio , sino devuelve False
		System.out.println("valido si mi array list esta vacio =" + jugadoresBarcelonaFC.isEmpty());

		//
		// ArrayList<JugadoresFutbol> arrayListCopia = new ArrayList<JugadoresFutbol>();
		// arrayListCopia = (ArrayList) JugadoresBarcelonaFC.clone();
		//

	}

}
