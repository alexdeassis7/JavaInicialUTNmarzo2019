package com.utn.clase2.sentencias;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		// definimos las variables
		float nota1, nota2, nota3;
		float promedio;
		// definimos objeto Scanner
		Scanner sc = new Scanner(System.in);
		// pedimos los datos al user
		System.out.println("Ingrese la nota 1");
		// tomamos el valor ingresado por el user
		nota1 = sc.nextFloat();
		System.out.println("Ingrese la nota 2");
		nota2 = sc.nextFloat();
		System.out.println("Ingrese la nota 3");
		nota3 = sc.nextFloat();

		// inicializamos las variables
		// nota1 = 5;
		// nota2 = 7;
		// nota3 = 10;
		// // calculamos el promedio
		promedio = (nota1 + nota2 + nota3) / 3;

		if (promedio >= 7) {
			System.out.printf("%.1f", promedio);
			System.out.println("usted aprobo - su promedio es:" + promedio);
		} else {

			System.out.println("Usted Reprobo - su promedio es : " + promedio);
		}

	}

}
