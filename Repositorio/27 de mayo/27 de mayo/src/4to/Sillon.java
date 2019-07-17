public class Sillon extends Silla{
    private int peso;
    private String color;
    public Sillon(){
        this.peso = 5;
        this.color = "rojo";
    }
    public Sillon(String color,int peso){
        this.peso=peso;
        this.color=color;
    }
}