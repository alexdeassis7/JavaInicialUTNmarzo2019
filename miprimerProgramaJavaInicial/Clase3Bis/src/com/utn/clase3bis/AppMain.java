package com.utn.clase3bis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AppMain {

	// Realizar un algoritmo que permita realizar N veces lo sig:
	// ingresar 2 numero calcular su suma e informar el resultado

	public static void main(String[] args) {

		int num1;

		int num2;
		Scanner sc = new Scanner(System.in);
		
		
		int flag = 1;// declaramos variable de tipo bandera

		while (flag == 1) {

			System.out.println("ingrese num 1");
			num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese num 1"));
			System.out.println("ingrese num 2");
			num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese num 2"));

			System.out.println("La suma es igual a :" + (num1 + num2));
			JOptionPane.showMessageDialog(null, "esto es un mensaje de información", "soy el titulo ", 0);
			System.out.println("Desea Continuar utilizando su calculadora? ");
			System.out.println("Ingrese un valor distinto de uno para salir");

			flag = Integer.parseInt(
					JOptionPane.showInputDialog("ingrese un valor distinto de 1 para salir de la calculadora"));

		}

	}

}
