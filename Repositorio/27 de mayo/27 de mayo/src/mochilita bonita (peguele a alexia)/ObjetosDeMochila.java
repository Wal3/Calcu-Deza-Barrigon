package mochila;
public class ObjetosDeMochila{
    private String marca;
    private double precio;
    public ObjetosDeMochila(double precio,String marca){
        this.precio=precio;
        this.marca=marca;
    }
    public String getMarca() {
        return this.marca;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
}