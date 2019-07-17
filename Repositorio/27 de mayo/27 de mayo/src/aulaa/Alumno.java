package aula;
public class Alumno extends Persona{
    private int promedio;
	public Alumno(int promedio,String nombre,String apellido,int edad,int aula){
	    super(nombre,apellido,edad,aula);
	    this.promedio=promedio;
	}
}