package zoo;
import java.util.HashSet;
public class Zoo{
    private HashSet<Animales> listaDeAnimales;
    public Zoo(){
        this.listaDeAnimales= new HashSet<Animales>();
    }
    public HashSet<Animales> getListaDeAnimales() {
        return listaDeAnimales;
    }
    public HashSet<String> AnimalesHerviboros(){
        HashSet<String> nombres= new HashSet<String>();
        for (String elemento : listaDeAnimales ) {
            if( elemento.getComida() == "Herviboro"){
                nombres.add(elemento);
            }
        }
        return nombres;
    }
}
