package motocicletas;
public class Chopera extends Motocicleta{
    private int precio;
    public Chopera(int precio){
        super(4800,"negra","yamaha");
        this.precio=precio;
    }
    public void MostrarAtributos(){
        super.MostrarAtributos();
        System.out.println(this.precio);
    }
}