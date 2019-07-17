package aula;
public class Persona{
    private int edad;
    private String aula;
    private String Nombre;
    private String Apellido;
    public Persona(String Nombre,String Apellido,int edad,String aula){
        this.edad=edad;
        this.aula=aula;
        this.Apellido=Apellido;
        this.Nombre=Nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getAula() {
        return aula;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setAula(String aula) {
        this.aula = aula;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }
}