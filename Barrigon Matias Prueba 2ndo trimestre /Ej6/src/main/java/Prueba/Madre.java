package Prueba;
import java.util.HashSet;
public class Madre extends Persona{
    private String nombreEmpresa;
    private HashSet <Hijo> listaHijos = new HashSet <Hijo>();
//Constructor
    public Madre(){
        super();
    }
//seter
    public void setEmpresa(String e){
        this.nombreEmpresa = e;
    }
//geter
    public String getEmpresa(){
        return this.nombreEmpresa;
    }
    public void addHijos(Hijo a){
        listaHijos.add(a);
    }
    public HashSet <Hijo> getHijos(){
        return this.listaHijos;
    }
    public HashSet <Hijo> hijosMenores(){
        HashSet <Hijo> hijosMenores = new HashSet <Hijo>();
        for (Hijo i : this.listaHijos) {
            if(i.getEdad()>18) hijosMenores.add(i);
        }
        return hijosMenores;
    }
    public void mostrarPersona(){
        super.mostrarPersona();
        System.out.println(this.nombreEmpresa);
        for (Hijo i : this.listaHijos) {
            System.out.println(i.getNombre());
        }
    }
}