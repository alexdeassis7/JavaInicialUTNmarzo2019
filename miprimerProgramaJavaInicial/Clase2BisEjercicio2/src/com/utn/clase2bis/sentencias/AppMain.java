package com.utn.clase2bis.sentencias;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {

		int hsTrabajadas, HsExtras, salarioSemanal;

		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese las horas Trabajadas");
		hsTrabajadas = sc.nextInt();

		if (hsTrabajadas > 40) {
			HsExtras = hsTrabajadas - 40;
			salarioSemanal = HsExtras * 20 + 40 * 16;

		} else {
			salarioSemanal = hsTrabajadas * 16;
		}

		System.out.println("su salario semanal es : " + salarioSemanal);

	}

}
