package clase7Bis;

import javax.swing.JOptionPane;

public class JugadoresFutbol {

	// defino atributos
	private String nombre;
	private int edad;
	private int categoria;

	public JugadoresFutbol() {
		// contructor vacio

	}

	public JugadoresFutbol(String nombre, int edad, int categoria) {

		this.nombre = nombre;
		this.edad = edad;
		this.categoria = categoria;

	}

	public void SolicitarDatosJugador() {
		int edadAuxiliar, categoriaAuxiliar;
		boolean flag = false;

		this.nombre = JOptionPane.showInputDialog("ingrese el nombre del jugador");
		do {
			if (flag) {
				edadAuxiliar = Integer.parseInt(
						JOptionPane.showInputDialog("EDAD INVALIDA - ingrese la edad del jugador nuevamente"));
			} else {
				// validamos que el jugador sea mayor de edad
				edadAuxiliar = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad del jugador"));
				flag = true;
			}
		} while (edadAuxiliar <= 18);
		this.edad = edadAuxiliar;
		flag = false;
		do {
			if (flag) {
				categoriaAuxiliar = Integer.parseInt(
						JOptionPane.showInputDialog("CATEGORIA INVALIDA - Reingrese la categoria del jugador"));
			} else {
				// validamos que el jugador sea de una categoria valida
				categoriaAuxiliar = Integer.parseInt(JOptionPane.showInputDialog("ingrese la categoria del jugador"));
				flag = true;
			}
		} while (categoriaAuxiliar < 1 || categoriaAuxiliar > 3);
		this.categoria = categoriaAuxiliar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "JugadoresFutbol [nombre=" + nombre + ", edad=" + edad + ", categoria=" + categoria + "]";
	}

}
