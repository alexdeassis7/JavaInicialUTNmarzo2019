package com.utn.javainicial;

import java.util.Scanner;
import java.math.*;

public class AppMain {

	public static void main(String[] args) {

		System.out.println("Menu Principal de operaciones matematicas SWITCH");
		Scanner sc = new Scanner(System.in);// instanciamos un objeto de tipo Sacanner para tomar datos desde el teclado
		String opcion = "";
		// Intanciar / crear un objeto de tipo calculadora
		// Calculador c1 = new Calculador();

		do {
			System.out.println("ingresa tu operacion Matematica: SALIR ,SUMA ,RESTA , MULTIPLICACION , DIVICION");
			opcion = sc.next().toUpperCase();// tomamos la opcion ingresada por el usuario

			if (!"SALIR".equals(opcion)) {// validamos que el usuario no ingrese la opcion de salir
				// solicitandso los numeros al user mediante la invocacion al metodo "pedir
				// valores"
				Calculador.pedirValores();
				switch (opcion) {
				case "SUMA":

					System.out.println("SUMA = " + Calculador.sumar());// invocamos a la funcion sumar de la clase
																		// Calculador
					break;

				case "RESTA":
					System.out.println("RESTA = " + Calculador.restar());// invocamos a la funcion restar de la clase
																			// Calculador
					break;

				case "MULTIPLICACION":
					System.out.println("MULTIPLICACION = " + Calculador.multiplicar());// invocamos a la funcion
																						// multiplicar de la clase
																						// Calculador

					break;

				case "DIVICION":

					System.out.println("DIVICION = " + Calculador.dividir());// invocamos a la funcion dividir de la
																				// clase Calculador

					break;
				default:
					Calculador.mostrarError2("OPCION ERRONEA");//// invocamos a la funcion "mostrarError2" de la clase
																//// Calculador
					break;
				}

			}

		} while (!"SALIR".equals(opcion));

	}

}
