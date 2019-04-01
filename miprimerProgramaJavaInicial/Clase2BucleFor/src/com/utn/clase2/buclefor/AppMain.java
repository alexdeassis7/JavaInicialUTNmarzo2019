package com.utn.clase2.buclefor;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {

		float sumaNotas, calificacion, promedio;
		sumaNotas = 0;

		Scanner sc = new Scanner(System.in);
		// i en una variable contador
		// defino for para solicitar las 7 calificaciones
		for (int i = 0; i < 7; i++) {

			System.out.println("ingrese la nota " + (i + 1));
			calificacion = sc.nextFloat();
			// utilizo variable acumulador
			sumaNotas = sumaNotas + calificacion;

		}

		promedio = sumaNotas / 7;
		System.out.println("el promedio de sus notas es : " + promedio);
	}

}
