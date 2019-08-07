
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class tests {
    @Test
    void EnOrden(){
        Sube arriba = new Sube();
        arriba.setViajesHechos(15);
        arriba.pagarViaje(10);
        arriba.setMetrosRecorridos(10.5f);
        assertTrue(arriba.orden());
    }
    @Test
    void EnDesorden(){
        Sube abajo = new Sube();
        abajo.setViajesHechos(15);
        abajo.pagarViaje(10);
        abajo.setMetrosRecorridos(100.5f);
        assertFalse(abajo.orden());
    }
    @Test
    void SinDescuento(){
        Sube izquierda = new Sube();
        izquierda.setViajesHechos(15);
        izquierda.pagarViaje(10);
        assertEquals(izquierda.getMetrosDisponibles(), 20);
    }
    @Test
    void ConDescuento(){
        Sube derecha = new Sube();
        derecha.setViajesHechos(35);
        derecha.pagarViaje(10);
        assertEquals(derecha.getMetrosDisponibles(), 40);
    }
    @Test
    void MetrosRecorridos(){
        Sube adelante = new Sube();
        adelante.setViajesHechos(35);
        adelante.pagarViaje(10);
        assertEquals(adelante.getMetrosRecorridos(), 0);
    }

}
