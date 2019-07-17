package habitacion;
public class Persianas extends Cortinas{
	private String color;
    private int anchocm;
    private int largocm;
    public Persianas(){
    	this.color="Rosas";
        this.anchocm=80;
        this.largo=200;
    }
    public Persianas(int ancho,int largo,String colour){
    	this.color=colour
        this.anchocm=anchocm;
        this.largocm=largocm;
    }
}