package com.utn.clase6GetSet;

public class EmpleadoApp {

	public static void main(String[] args) {

		/*
		 * Creaamo un array de objetos de la clase empleados
		 */
		Empleado arrayObjetos[] = new Empleado[10];

		// creamos objetos en cada posision
//		arrayObjetos[0] = new Empleado("Alex", "De Assis", 25, 25000); // invocamos al constructor 4
//		arrayObjetos[1] = new Empleado("Juan", "miron", 19, 100000);// invocamos al constructor 4
//		arrayObjetos[2] = new Empleado("Ariel", "Alvarez", 21);// invocamos al constructor 4

		//arrayObjetos[2].setSalario(15006);// utilizamos metodo Setters
		
		for (int i = 0; i < 3; i++) {
			arrayObjetos[i] = new Empleado(); //intancio obejtos empleados para las 3 primeras posiciones del array
			arrayObjetos[i].solicitarDatosEmpleado();//invocamos al metodo solicitar datos de la clase empleado
			
		}
		

		for (int i = 0; i < 3; i++) {
			System.out.println(arrayObjetos[i].toString()); //invocamos al metodo toString para mostras los datos del objeto
			// System.out.println("##########Empleado " + i + " ##############");
			// System.out.println(arrayObjetos[i].getNombre());
			// System.out.println(arrayObjetos[i].getApellido());
			// System.out.println(arrayObjetos[i].getEdad());
			// System.out.println(arrayObjetos[i].getSalario());

		}

		int suma = 0;
		
		for (int i = 0; i < 3; i++) {
			suma += arrayObjetos[i].getSalario();//calculo la suma de todos los salarios invocando al metodo getters de salario			
		
		}
		System.out.println("La suma de salarios es " + suma);
		
	}

}
