package aula;
import java.util.ArrayList;
public class Aula2{
    private ArrayList<Alumno> alumnoLista;
    public Aula2(){
        this.alumnoLista=new ArrayList<Alumno>();
    }
    public int CuantosMayoresEdad(){
        int total;
        for(int i=0;i<this.alumnoLista.size();i++){
            if (this.alumnoLista.get(i).getEdad()>17){
                total=total+1;
            }
        }
        return total;
    }
}