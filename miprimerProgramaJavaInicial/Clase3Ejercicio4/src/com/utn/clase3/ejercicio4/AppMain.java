package com.utn.clase3.ejercicio4;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		// DEFINICION DE CONSTANTES
		final double MENOSDEUNANIO = 0.05;
		final double MENOSDEDOSANIO = 0.07;
		final double MENOSDE5ANIO = 0.10;
		final double MENOSDEDIEZANIO = 0.15;
		final double MASDEDIEZANIO = 0.20;

		double utilidad;
		double antiguedad;
		double salarioMesual;

		Scanner sc = new Scanner(System.in);

		System.out.println("ingrese su salario ");
		salarioMesual = sc.nextDouble();

		System.out.println("ingrese su antiguedad en la empresa");
		antiguedad = sc.nextDouble();

		if (antiguedad < 1) {
			utilidad = salarioMesual * MENOSDE5ANIO;
		} else if (antiguedad >= 1 && antiguedad < 2) {
			utilidad = salarioMesual * MENOSDEDOSANIO;

		} else if (antiguedad >= 2 && antiguedad < 5) {
			utilidad = salarioMesual * MENOSDE5ANIO;

		} else if (antiguedad >= 5 && antiguedad < 10) {
			utilidad = salarioMesual * MENOSDEDIEZANIO;

		} else {
			utilidad = salarioMesual * MASDEDIEZANIO;

		}

		System.out.println("su utilidad fue de : " + utilidad);

	}

}
