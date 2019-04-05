package com.utn.clase6GetSet;

import javax.swing.JOptionPane;

public class Empleado {

	//defino atributos privados de la clase
	private String nombre;
	private String apellido;
	private int edad;
	private int salario;
	private int auxiliar;
	private boolean flag = false;

	// CONSTRUCTORES:
	/*
	 * Un constructor es un metodo especial de una clase que se llama
	 * automaticamente siempre que se declara un objeto de esa clase Su funcion es
	 * inicializar el objeto y sirve para asegurarnos que los objetos siempre
	 * contengan valores válidos
	 *
	 * 
	 * Cuando se crea un objeto en Java se realizan las siguiente operaciones
	 * automaticamente
	 * 
	 * 1.Se asigna memoria para el objeto 2.Se inicializan los atributos de ese
	 * objeto con los valores predeterminados por el sistema 3.Se llama al
	 * constructor de la clase que puede ser uno entre varios
	 * 
	 * EL CONSTRUCTOR DE LA CLASE TIENE LAS SIGUIENTES CARACTERISTICAS:
	 * 
	 * a) no se hereda b) E n una clase puede haber varios constructores con el
	 * mismo nombre y distinto número de argumentos (se puede sobrecargar) c) debe
	 * declararse Simepre público (salvo casos muy excepcionales) para que pueda ser
	 * invocado desde cualquier parte donde se desee crear un objeto de su clase!
	 * 
	 */
	// Sobrecarga de Constructores
	
	// constructor 1 que recibe 3 parametros
	public Empleado(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Empleado() {
		//Constructor Vacio no recibe ningu¿ún parametro
	}

	// constructor 2	recibe un parametro
	public Empleado(int edad) {

		this.edad = edad;
	}

	// constructor 3 recibe dos parametros
	public Empleado(String nombre, String apellido) {

		this.nombre = nombre;
		this.apellido = apellido;
	}
	// constructor 4 recibe 4 parametros

	public Empleado(String nombre, String apellido, int edad, int salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}

	// defino metodo para solicitar datos al user!
	public void solicitarDatosEmpleado() {

		this.nombre = JOptionPane.showInputDialog("Escribe un nombre");
		this.apellido = JOptionPane.showInputDialog("Escribe un apellido");

		do {
			if (flag) {
				JOptionPane.showMessageDialog(null, "Ingreso una edad invalida", "ERROR", JOptionPane.ERROR_MESSAGE);;
			}
			flag = true;
			this.auxiliar = Integer.parseInt((JOptionPane.showInputDialog("escribe la edad")));
		
			
		} while (auxiliar <= 0);
		this.edad = auxiliar;

		this.salario = Integer.parseInt((JOptionPane.showInputDialog("Ingrese el salario")));

	}

	@Override // sobreescribimos el metodo ToString heredado de la superClase!
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ "]";
	}

	
	
	
	
	// Encapsulamiento
	/*
	 * a todos los atributos de la clase con modificador de acceso Private se accede
	 * mediante metodos publicos!
	 *
	 * Getters and Setters: Son métodos de acceso lo que indica que son siempre
	 * declarados Públicos nos sirven para dos cosas:
	 */

	// 1)Metodos Getters
	/*
	 * Definicion: del Inglés "Get" que significa Obtener, nos sirve para obtener
	 * (recuperar o acceder) el valor ya asignado a un atributo
	 * 
	 * 2) Metodos Setters Definicion : Del Inglés Set , que significa establecer ,
	 * nos sirve para asignar un valor inicial a un atributo , pero de forma
	 * explícita, además el Setter nunca retorna nada (Siempre es void ), y solo nos
	 * permite dar acceso público a ciertos atributos que deseemos el usuario pueda
	 * modificar!
	 * 
	 */

	
	//declaracion de metodos Getters
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public int getSalario() {

		return this.salario;

	}

	// Declaracion de metodos Setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setSalario(int salario) {

		this.salario = salario;

	}



}
