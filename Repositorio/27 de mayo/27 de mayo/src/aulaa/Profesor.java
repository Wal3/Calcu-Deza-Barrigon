package aula;
import java.util.HashSet;
import java.util.HashSet;
public class Profesor extends Persona{
    private HashSet<String> Materia;
    public Profesor(String Nombre,String Apellido,int edad,int aula){
        super(Nombre,Apellido,edad,aula);
        this.Materia= new HashSet<String>();
    }
	public HashSet<String> getMateria(){
	    return this.Materia;
	}
}