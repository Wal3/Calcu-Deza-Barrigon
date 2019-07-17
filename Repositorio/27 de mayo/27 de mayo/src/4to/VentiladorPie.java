package habitacion;
public class VentiladorPie extends Ventilador{
    private String color;
    private int peso;
    public VentiladorPie(){
        this.color="naranja";
        this.peso=15;
    }
    public VentiladorPie(int peso,String color){
        this.color=color;
        this.peso=peso;
    }
}