package Prueba;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class AppTest 
{
    @Test
    public void Test3()
    {
        Persona p = new Persona(36201913, "Josefina", "Fijo", 40, "Hija y productora del Piñon", "Mujer");   
        assertTrue(p.dniMenor38Millones()==true);
    }
    @Test
    public void Test1()
    {
        Persona p = new Persona(36201913, "Josefina", "Fijo", 40, "Hija y productora del Piñon", "Mujer");
        assertTrue(p.mayorEdad()==true);
    }
    @Test
    public void Test2()
    {
        Persona p = new Persona(36201913, "Josefina", "Fijo", 40, "Hija y productora del Piñon", "Mujer");   
        assertTrue(p.nombreConA()==true);
    }
    @Test
    public void Test4()
    {
        Hijo ph = new Hijo(39201929, "Piñonsito", "Fijo", 2, "-", "Hombre", "Mario -1", "Wakanda's Special School");
        Madre m = new Madre();
        m.setEmpresa("empresa");
        m.addHijos(ph); 
        assertTrue(m.hijosMenores().contains(ph));
    }
}
