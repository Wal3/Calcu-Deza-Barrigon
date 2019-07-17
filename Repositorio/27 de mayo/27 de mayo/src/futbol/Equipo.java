package futbol;
import java.util.HashMap;
public class Team{
    private HashMap<String,Integer> Compis;
    public Team(){
       this.Compis = new HashMap<String,Integer>();
    }
    public void agregarJugador(String Nombre,int numero){
        this.Compis.put(Nombre,numero);
    }
    public void JugadoresImpares(){
        for (Map.Entry elemento : this.Compis.entrySet())
            if (elemento.getValues() % 2 != 0) {
                System.out.println("Compis impares: " + elemento.getKey());
            }
    }
}