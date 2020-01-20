package Alumnos;

public class Datos {

	public String nombre;
	public String apellido;
	public int legajo;
	public int notadematematica;
	public int notadelengua;
	public int notadeprogramacion;
	public float promedio;
	
	public Datos(String nombre, String apellido, int legajo,int notadelengua, int notadematematica, int notadeprogramacion, float promedio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.notadematematica = notadematematica; 
		this.notadelengua = notadelengua;
		this.notadeprogramacion = notadeprogramacion;
		this.promedio = promedio;
	}

	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre () {
	 return	this.nombre;
	}
	public void printNombre() {
		System.out.print(nombre);
	}

	public int promedio() {
		return 0;
	}
	
}