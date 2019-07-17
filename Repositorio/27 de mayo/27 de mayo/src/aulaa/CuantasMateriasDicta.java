package aula;
import java.util.ArrayList;
public class CuantasMateriasDicta{
    private ArrayList<Profesor> Profesores;
    public CuantasMateriasDicta(){
        this.Profesores=new ArrayList<Profesor>();
    }
    public int CantidadMaterias(String nombre){
        int total=0;
        for(int i=0;i<this.Profesores.size();i++){
            if(this.Profesores.get(i).getNombre()==nombre){
                for (String elemento : this.Profesores.getMateria() ){
                total=total+1;
                }
            }
        }
        return total;
    }
}
