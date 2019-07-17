package personajes;
public class ObjetosPersonajes{
    private String genero;
    private boolean estaVivo;
    private String nombre;
    private int edad;
    public ObjetosPersonajes(String nombre,int edad,String genero,boolean estaVivo){
        this.genero=genero;
        this.estaVivo=estaVivo;
        this.nombre=nombre;
        this.edad=edad;
    }
    public String getGenero() {
        return this.genero;
    }
    public boolean isEstaVivo() {
        return estaVivo;
    }
    public int getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}