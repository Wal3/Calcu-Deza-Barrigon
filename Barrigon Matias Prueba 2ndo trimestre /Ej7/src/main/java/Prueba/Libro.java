package Prueba;
public class Libro{
    private int coste;
    private Editorial editorial;
    public Libro(){
    }
    public Libro(int costo, Editorial editorial){
        this.coste = costo;
        this.editorial = editorial;
    }
    public void setCoste(int costo){
        this.coste = costo;
    }
    public void setEditorial(Editorial editorial){
        this.editorial = editorial;
    }
    public int getCoste(){
        return this.coste;
    }
    public Editorial getEditorial(){
        return this.editorial;
    }
}