package com.utn.javainicial.clase5;

public class Persona {

	// Metodo Constructor
	/**
	 * Caracteristicas del metodo constructor 1. Debe tener el mimso nombre que la
	 * Clase a la cual pertenece 2.NO puede ser heredado 3.No retorna ningun Valor
	 * (Ni void), por lo cual no debe especificarce ningún tipo de dato 4.Cuando en
	 * una clase no especificamos ningún tipo de constructor , el compilador añade
	 * uno público por omisión sin parámetro, el cual NO hace nada
	 * 
	 * 
	 */
	public Persona() {
		//
		// este es el constructor heredado de la superclase "java.lang.Object"

	}

	public Persona(String nombre, int edad, float peso, float altura, char sexo) {

		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}

	// Definimos e inicializamos atributos privados de la clase Persona!

	// CONTANTES
	private static final char SEXO = 'h';
	private static final int FLACO = -1;
	private static final int MEDIO = 0;
	private static final int GORDITO = 1;

	// variables;
	private String nombre = null;
	private int edad = 0;
	private int dni = 0;
	private float peso = 0.0f;
	private float altura = 0.0f;
	private char sexo = SEXO;

	// metodo para calcular el IMC de una persona
	public int calcularIMC(float peso, float altura) {
		this.peso = peso;
		this.altura = altura;

		// float imc = peso / Math.pow(altura, 2);
		float imc = peso / (altura * altura);

		if (imc < 20) {

			return FLACO;

		} else if (imc <= 25) {
			return MEDIO;

		} else {

			return GORDITO;

		}

	}

	// comprueba si el sexo introducido es correcto
	// si no es correcto , sera H
	public void comprobarSexo(char sexo) {
		if (sexo != 'm' && sexo != 'h') {
			this.sexo = 'h';
		} else {
			this.sexo = sexo;
		}

	}

	// metodo que verifica la edad
	public boolean esMayorDeEdad(int edad) {
		this.edad = edad;
		if (edad >= 18) {
			return true;
		}
		return false;
	}

	// metodo generador de Dni aleatorio
	public int generaDNI() {
		// genero un numero aleatorio de 8 cifras utilizando la funcion Random de la
		// libreria Math , luego casteo el valor a int para alojarlo en la variable dni

		dni = (int) (Math.random() * 50000051) + 1;
		return dni;
	}

	// sobreEscribimos el metodo ToString que heredamos de la super Clase
	// Java.Lang.Object
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", peso=" + peso + ", altura=" + altura
				+ ", sexo=" + sexo + "]";
	}

}
