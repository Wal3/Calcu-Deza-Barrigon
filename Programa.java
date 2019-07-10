import java.util.ArrayList;
import java.util.Stack;
public class Programa
{
    private ArrayList<Instruccion> instruccion;
    public Programa()
    {
        this.instruccion = new ArrayList<Instruccion>();
    }
    public void agregarInstruccion(Instruccion nueva)
    {
        this.instruccion.add(nueva);
    }
    public ArrayList<Instruccion> getInstrucciones()
    {
        return this.instruccion;
    }
}