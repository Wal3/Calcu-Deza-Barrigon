package aula;
public class Computadora{
    private String usuario;
    private int numero;
    public Computadora(int numero,String usuario){
        this.usuario=usuario;
        this.numero=numero;
    }
    public String getUsuario(){
        return usuario;
    }
    public int getNumero(){
        return numero;
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
}
