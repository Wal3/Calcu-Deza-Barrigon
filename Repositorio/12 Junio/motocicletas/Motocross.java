package motocicletas;
public class Motocross extends Motocicleta{
    private boolean cambios;
    public Motocross(boolean cambios){
        this.cambios=cambios;
        super(38,"gris","yeti");
    }
    public void MostrarAtributos(){
        super.MostrarAtributos();
        System.out.println(this.cambios);
    }
}