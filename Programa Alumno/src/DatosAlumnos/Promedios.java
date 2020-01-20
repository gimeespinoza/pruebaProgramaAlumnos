package DatosAlumnos;

import Alumnos.Datos;
import java.util.Scanner;

public class Promedios {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		//Datos MiVariable = new Datos("nombre","apellido", 1, 7,  8,9, 8.0f);
		Datos Alumno1 = new Datos(null, null, 0, 0, 0, 0, 0);
		Datos Alumno2 = new Datos(null, null, 0, 0, 0, 0, 0);
		Datos Alumno3 = new Datos(null, null, 0, 0, 0, 0, 0);
		Datos Alumno4 = new Datos(null, null, 0, 0, 0, 0, 0);
		Datos Alumno5 = new Datos(null, null, 0, 0, 0, 0, 0);
		
//Metodo Manual para ingresar con teclado y ver los resultados por los 5 alumnos.

//Ejercicio Alumno 1
		
		System.out.print("Ingrese el primer alumno 1");
		Alumno1.nombre = teclado.next();
		System.out.print("Ingrese el apellido alumno 1");
		Alumno1.apellido = teclado.next();
		System.out.print("Ingrese el legajo alumno 1");
		Alumno1.legajo = teclado.nextInt();
		System.out.print("Ingrese notalengua");
		Alumno1.notadelengua = teclado.nextInt();
		System.out.print("Ingrese notamatematica");
		Alumno1.notadematematica = teclado.nextInt();
		System.out.print("Ingrese notaprogramacion");
		Alumno1.notadeprogramacion = teclado.nextInt();
		System.out.print("El promedio de las notas es:");
		System.out.print((Alumno1.notadelengua+Alumno1.notadematematica+Alumno1.notadeprogramacion)/3);
		
		if (Alumno1.promedio()>6) {
			System.out.print("El alumno no esta aprobado");
		}else {
		if (Alumno1.promedio()<3) {
			System.out.print("El alumno tiene materias sin aprobar");
		}else {
		if (Alumno1.promedio()<3) {	
		if (Alumno1.promedio()<9) {
			System.out.print("Es un alumno destacado");
		}
	}
}
	
//Ejercio Alumno 2
		/*System.out.print("Ingrese el primer alumno 2");
		Alumno2.nombre = teclado.next();
		System.out.print("Ingrese el apellido alumno 2");
		Alumno2.apellido = teclado.next();
		System.out.print("Ingrese el legajo alumno 2");
		Alumno2.legajo = teclado.nextInt();
		System.out.print("Ingrese notalengua");
		Alumno2.notadelengua = teclado.nextInt();
		System.out.print("Ingrese notamatematica");
		Alumno2.notadematematica = teclado.nextInt();
		System.out.print("Ingrese notaprogramacion");
		Alumno2.notadeprogramacion = teclado.nextInt();
		System.out.print("El promedio de las notas es:");
		System.out.print((Alumno2.notadelengua+Alumno2.notadematematica+Alumno2.notadeprogramacion)/3);


//Ejercio Alumno 3
		
		System.out.print("Ingrese el primer alumno 3");
		Alumno3.nombre = teclado.next();
		System.out.print("Ingrese el apellido alumno 3");
		Alumno3.apellido = teclado.next();
		System.out.print("Ingrese el legajo alumno 3");
		Alumno3.legajo = teclado.nextInt();
		System.out.print("Ingrese notalengua");
		Alumno3.notadelengua = teclado.nextInt();
		System.out.print("Ingrese notamatematica");
		Alumno3.notadematematica = teclado.nextInt();
		System.out.print("Ingrese notaprogramacion");
		Alumno3.notadeprogramacion = teclado.nextInt();
		System.out.print("El promedio de las notas es:");
		System.out.print((Alumno3.notadelengua+Alumno3.notadematematica+Alumno3.notadeprogramacion)/3);
		*/
	}
}
		