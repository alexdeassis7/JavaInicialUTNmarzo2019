package com.utn.main;
import java.util.Scanner;
import com.utn.database.Alumno;;

public class Clase1Java {

	public static void main(String[] args) {
		
		//instanciamos objeto de tipo alumno 
		
		Alumno alumno1 = new Alumno("alex", 26, 36863837);
		System.out.println(alumno1.toString());
		
		alumno1.muestreCarreraAlumno();
		alumno1.pesoAlumno();

	}

}
