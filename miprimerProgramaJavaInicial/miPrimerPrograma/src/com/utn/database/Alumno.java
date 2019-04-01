package com.utn.database;

public class Alumno {
	// modificador de acceso
	private String nombre1;
	private int edad;
	private long legajo;

	// Creamos metodo constructor
	// se debe llamar igual que la clase!
	public Alumno(String nombre, int edad, long legajo) {
		
		nombre1 = nombre;
		this.edad = edad;
		this.legajo = legajo;

	}
	//defino dos procedimientos!
	public void muestreCarreraAlumno() {
		
		System.out.println("soy alex y estudio cocina Gourmet");
		
	}
	
	public void pesoAlumno() {
	System.err.println("soy alex peso 70Kg y tu programa tiene un Error");
		
	}
	//sobreescribo la funcion heredad de la superclase de Java!
	@Override
	public String toString() {
		 return "Alumno [nombre =" + nombre1 +",edad =" + edad +",legajo= " + legajo+"]";
		
	}

}
