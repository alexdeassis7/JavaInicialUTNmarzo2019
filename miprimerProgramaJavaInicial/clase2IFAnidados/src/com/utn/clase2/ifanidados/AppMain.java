package com.utn.clase2.ifanidados;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		int n1, n2, n3, mayor;

		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese nota 1");
		n1 = sc.nextInt();

		System.out.println("ingrese nota 2");
		n2 = sc.nextInt();

		System.out.println("ingrese nota 3");
		n3 = sc.nextInt();

		if ((n1 > n2) && (n1 > n3)) {

			mayor = n1;
		} else if ((n2 > n3) && (n2 > n1)) {
			mayor = n2;

		} else {
			mayor = n3;
		}

		System.err.println("el mayor de los tres numeros ingresados es " + mayor);
	}

}
