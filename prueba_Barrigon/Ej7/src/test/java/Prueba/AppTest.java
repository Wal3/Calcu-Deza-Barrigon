package Prueba;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class AppTest {
    @Test
    public void Test2(){
        /*
            el nombre del método debería indicar
            cuál es caso que se está probando en él
        */
        Libreria libreria = new Libreria();
        Libro libro1 = new Libro(564, Editorial.ALIANZA);
        Libro libro2 = new Libro(186, Editorial.KAPELUZ);
        Libro libro3 = new Libro(359, Editorial.ATLÁNTIDA);
        Libro libro4 = new Libro(135, Editorial.INTERZONA);
        Libro libro5 = new Libro(765, Editorial.KAPELUZ);
        Libro libro6 = new Libro(915, Editorial.SUDAMERICA);
        Libro libro7 = new Libro(549, Editorial.SUR);
        libreria.setVentas();
        libreria.addLibro(libro1);
        libreria.addLibro(libro2);
        libreria.addLibro(libro3);
        libreria.addLibro(libro4);
        libreria.addLibro(libro5);
        libreria.addLibro(libro6);
        libreria.addLibro(libro7);
        assertTrue(libreria.topVentas() == Editorial.KAPELUZ);
    }
    @Test
    public void Test1(){
        Libreria libreria = new Libreria();
        Libro libro1 = new Libro(9999, Editorial.ALIANZA);
        libreria.setVentas();
        libreria.addLibro(libro1);
        assertTrue( libreria.getVentasPorEditorial(Editorial.ALIANZA) == 1 );
    }


}
