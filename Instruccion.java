import java.util.ArrayList;
import java.util.Stack;
public class Instruccion
{
    private String rutina;
    private int valor;
    private String nombreOperacion;
    private String nombreVariable;
    public Instruccion(String rutina,String nombreOperacion,int valor)
    {
        this.rutina=rutina;
        this.nombreOperacion=nombreOperacion;
        this.valor=valor;
        this.nombreVariable="";
     }
    public Instruccion(String rutina,String nombreOperacion,String nombreVariable)
    {
        this.rutina=rutina;
        this.nombreVariable=nombreVariable;
        this.nombreOperacion=nombreOperacion;
        this.valor=0;
    }
    public Instruccion(String rutina,String nombreOperacion)
    {
        this.rutina=rutina;
        this.nombreVariable="";
        this.nombreOperacion=nombreOperacion;
        this.valor=0;     
    }
    public String getRutina()
    {
        return this.rutina; 
    }
    public int getValor()
    {
        return this.valor;
    }
    public String getNombreOperacion()
    {
        return this.nombreOperacion;
    }
    public String getNombreVariable()
    {
        return this.nombreVariable;
    }
}