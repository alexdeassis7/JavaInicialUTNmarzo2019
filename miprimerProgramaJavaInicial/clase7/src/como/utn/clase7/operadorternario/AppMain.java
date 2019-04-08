package como.utn.clase7.operadorternario;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// calcular el mayor de dos numeros que el usuario ingreso por teclado

		int numero1, numero2;
		int resultado;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));

		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

		// operador TERNARIO!
		// Estructura operador ?: es la siguiente
		// Variable = (condicion)?valor1:valor2;

		resultado = (numero1 > numero2) ? numero1 : numero2;

		System.out.println("El mayor es : " + resultado);

		// Donde la variable resultado recibira el valor de numero1 en el caso
		// de que la condición sea true o bien el valor de numero2 en el caso
		// de que la condicion sea False

	}

}
