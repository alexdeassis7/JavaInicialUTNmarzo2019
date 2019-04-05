package com.utn.javainicial.clase5;

import java.util.Scanner;


	//			EJERCICIO 
//
//1) Haz una clase llamada Persona que siga las siguientes condiciones:
//
//Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
//Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.
//
//Los métodos que se implementaran son:
//
//calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
//
//esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
//
//comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
//
//toString(): devuelve toda la información del objeto.
//
//generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
//Métodos set de cada parámetro, excepto de DNI.
//Ahora, crea una clase ejecutable que haga lo siguiente:
//
//Pide por teclado el nombre, la edad, sexo, peso y altura.
//instancia 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
//Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
//Indicar para cada objeto si es mayor de edad.
//Por último, mostrar la información de cada objeto.
//Puedes usar métodos en la clase ejecutable, para que os sea mas fácil.

public class AppMain {

	public static void main(String[] args) {

		int miarray[] = new int[3];// declaramos un Array de tipo int
		// imprimimos el array
		System.out.println(miarray[0]);
		System.out.println(miarray[1]);
		System.out.println(miarray[2]);
		// cargamos el array con valores
		miarray[0] = 67;
		miarray[1] = 24;
		miarray[2] = 45;
		// imprimimos el array nuevamente
		System.out.println(miarray[0]);
		System.out.println(miarray[1]);
		System.out.println(miarray[2]);

		// instanciamos tres objetos de tipo persona llamado p1,p2,p3 utilizando el
		// constructor VACIO
		Persona p1;
		Persona p2 = new Persona();
		Persona p3 = new Persona();

		Scanner sc = new Scanner(System.in);
		String name = null;
		int edad = 0;
		float peso = 0;
		float altura = 0;
		char sexo = 0;

		// solicito los datos al usuario

		System.out.println("ingrese el nombre ");
		name = sc.nextLine();
		System.out.println("ingrese la edad");
		edad = sc.nextInt();
		System.out.println("ingrese el peso");
		peso = sc.nextFloat();
		System.out.println("ingrese la altura ");
		altura = sc.nextFloat();
		System.out.println("ingrese el sexo M o H ");
		sexo = sc.next().charAt(0);

		p1 = new Persona(name, edad, peso, altura, sexo);

		// imprimo todos los atributos del objeto p1 ,p2 y p3 utilizando el metodo
		// ToString heredado de la Superclase

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		

	}

}
