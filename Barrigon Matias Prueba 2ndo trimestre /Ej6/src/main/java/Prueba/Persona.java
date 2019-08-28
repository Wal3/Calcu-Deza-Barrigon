package Prueba;
public class Persona{
    private long dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String ocupacion;
    private String sexo;
    public Persona(){
        this(39201925L,"Carlitos","Bala",33, "Baterista", "Masculino");
    }
    public Persona(long dni, String nombre, String apellido, int edad, String ocupacion, String genero){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.sexo = genero;
    }
    public void setDni(long dni){
        this. dni = dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setOcupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    public void setSexo(String genero){
        this.sexo = genero;
    }
    public long getDni(){
        return this.dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getOcupacion(){
        return this.ocupacion;
    }
    public String getSexo(){
        return this.sexo;
    }
    public boolean nombreConA(){
        String temp = this.nombre;
        boolean x=false;
        for(int i=temp.length(); i!=0; i--){
            if(temp.contains("a")){
                x = true;
                break;
            }
        }
        return x;
    }
    public boolean mayorEdad(){
        boolean x;
        if(this.edad>=18) x = true;
        else x = false;
        return x;
    }
    public boolean dniMenor38Millones(){
        boolean x=false;
        if(this.dni<38000000) x = true;
        else x = false;
        return x;
    }
    public void mostrarPersona(){
        System.out.println(this.dni);
        System.out.println(this.nombre);
        System.out.println(this.apellido);
        System.out.println(this.edad);
        System.out.println(this.ocupacion);
        System.out.println(this.sexo);
    }
}