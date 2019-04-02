package com.utn.javainicial;

import java.util.Scanner;

/*IMPLEMENTACION DE MéTODOS EN JAVA pasos a seguir:
 * 
 * 1.describir lo que el meétodo debe hacer
 * 2.determinar las entradas del método
 * 3.determinar los tipos de datos de entrada(int, double, etc)
 * 4.determinar el tipo de valor de retorno si lo ubiera
 * 5.escribir las instrucciones que forman parte del cuerpo del método 
 * 6. diseñar casos de prueba
 * 
 *¿¿para que nos sirve??
 *-podemos construir programas modulares
 *-se consigue la reutilización de código . En lugar de escribir el mismo
 * código repetido cuando se necesite, por ejemplo para validar una fecha,
 * se hace una llamada al metodo que realiza esta tarea  
 * - en java un metodo SIEMPRE PERTENECE A UNA CLASE
 * *
**/

public class Calculador {
	
	// Clase:concepto de programacion orientada a objetos , es una forma de encapsular
	// funcionalidades , contiene campos (estado= y metodos  (comportamiento)
	// METODO : conjunto de instrucciones que cumplen una tarea!, pertenece a una clase
	// metodo Procedimientos: no retornan ningún valor
	// metodo funcion: siempre retorna un valor
	
	
	

	// modificadores de acceso: indica la visibilidad de un procedimiento o funcion
	// viene determinada por la declaracion "private , public o protected".
	// Por defecto si no se indica nada se entiende que es PUBLIC!
	

	static int num1;
	static int num2;
	
	// defino metodo - funcion
	public static int sumar() {
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}

	// defino metodo - funcion
	public static int restar() {
		int resultado;
		resultado = num1 - num2;

		return resultado;
	}

	// defino metodo - funcion
	public static int dividir() {
		int resultado;
		if (num2 != 0) {
			resultado = num1 / num2;
			return resultado;
		} else {
			mostrarError("no se puede dividir por cero");
			return 0;
		}

	}

	// defino metodo - procedemiento privado!
	private static void mostrarError(String mensajeDeError) {
		System.err.println("###############################################");
		System.err.println("##########" + mensajeDeError + "#############");
		System.err.println("###############################################");

	}

	// defino metodo - procedemiento publico!
	public static void mostrarError2(String mensajeDeError) {
		System.err.println("###############################################");
		System.err.println("##########" + mensajeDeError + "#############");
		System.err.println("###############################################");

	}

	// defino metodo - funcion
	public static int multiplicar() {
		int resultado;
		resultado = num1 * num2;
		return resultado;
	}

	// defino metodo - procedimiento
	public static void pedirValores() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese el valor de A");
		num1 = sc.nextInt();

		System.out.println("ingrese el valor de b");
		num2 = sc.nextInt();

	}

}
