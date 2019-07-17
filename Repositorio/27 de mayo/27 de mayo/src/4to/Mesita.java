package habitacion;
public class Mesita extends Mesa{
    private String color;
    private int altura;
    public Mesita(int altura,String color){
        this.color=color;
        this.altura=altura;
    }
    public Mesita(){
        this.color="rosa";
        this.altura=3;
    }
}