package Prueba;
public class Hijo extends Persona{
    private String juego;
    private String colegio;
    public Hijo(){
        super();
    }
    public Hijo(long dni, String nombre, String apellido, int edad, String genero, String ocupacion, String juego, String colegio){
        super();
        this.juego = juego;
        this.colegio = colegio;
    }
    public String getColegio(){
    	return this.colegio;
    }
    public void setEscuela(String colegio){
        this.colegio=colegio;
    }
    public void setJuego(String game){
        this.juego=game;
    }
    public void mostrarPersona(){
        super.mostrarPersona();
        System.out.println(this.colegio);
        System.out.println(this.juego);
    }
}