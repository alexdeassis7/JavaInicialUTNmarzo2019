package com.utn.javainicial;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		System.out.println("Menu Principal de operaciones matematicas SWITCH");
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		String opcion = "";
		do {
			System.out.println("ingresa tu operacion Matematica: SALIR ,SUMA ,RESTA , MULTIPLICACION , DIVICION");
			opcion = sc.next().toUpperCase();

			if (!"SALIR".equals(opcion)) {
				// solicitandso los numeros al user
				System.out.println("ingrese el valor de A");
				a = sc.nextInt();

				System.out.println("ingrese el valor de b");
				b = sc.nextInt();
				switch (opcion) {
				case "SUMA":
					System.out.println("SUMA = " + (a + b));
					break;

				case "RESTA":
					System.out.println("RESTA = " + (a - b));
					break;

				case "MULTIPLICACION":
					System.out.println("MULTIPLICACION = " + (a * b));

					break;
				default:
					System.out.println("OPCION ERRONEA");
					break;
				}

			}

		} while (!"SALIR".equals(opcion));

	}

}
