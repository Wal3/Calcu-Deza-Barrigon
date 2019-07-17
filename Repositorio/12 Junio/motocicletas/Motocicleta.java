package motocicletas;
public class Motocicleta{
    private String marca;
    private int rodado;
    private String color;
    public Motocicleta(int rodado,String color, String marca){
        this.marca=marca;
        this.rodado=rodado;
        this.color=color;
    }
    public void MostrarAtributos(){
        System.out.println(this.marca);
        System.out.println(this.rodado);
        System.out.println(this.color);
    }
}