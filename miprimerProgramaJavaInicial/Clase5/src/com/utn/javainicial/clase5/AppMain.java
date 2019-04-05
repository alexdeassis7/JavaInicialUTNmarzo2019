package com.utn.javainicial.clase5;

import java.util.Scanner;


	//			EJERCICIO 
//
//1) Haz una clase llamada Persona que siga las siguientes condiciones:
//
//Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el m�s adecuado, tambi�n su tipo. Si quieres a�adir alg�n atributo puedes hacerlo.
//Por defecto, todos los atributos menos el DNI ser�n valores por defecto seg�n su tipo (0 n�meros, cadena vac�a para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.
//
//Los m�todos que se implementaran son:
//
//calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta f�rmula devuelve un valor menor que 20, la funci�n devuelve un -1, si devuelve un n�mero entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la funci�n devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la funci�n devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
//
//esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
//
//comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
//
//toString(): devuelve toda la informaci�n del objeto.
//
//generaDNI(): genera un n�mero aleatorio de 8 cifras, genera a partir de este su n�mero su letra correspondiente. Este m�todo sera invocado cuando se construya el objeto. Puedes dividir el m�todo para que te sea m�s f�cil. No ser� visible al exterior.
//M�todos set de cada par�metro, excepto de DNI.
//Ahora, crea una clase ejecutable que haga lo siguiente:
//
//Pide por teclado el nombre, la edad, sexo, peso y altura.
//instancia 3 objetos de la clase anterior, el primer objeto obtendr� las anteriores variables pedidas por teclado, el segundo objeto obtendr� todos los anteriores menos el peso y la altura y el �ltimo por defecto, para este �ltimo utiliza los m�todos set para darle a los atributos un valor.
//Para cada objeto, deber� comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
//Indicar para cada objeto si es mayor de edad.
//Por �ltimo, mostrar la informaci�n de cada objeto.
//Puedes usar m�todos en la clase ejecutable, para que os sea mas f�cil.

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
