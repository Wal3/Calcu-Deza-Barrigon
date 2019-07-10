import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Stack;
import org.junit.jupiter.api.Test;
import sun.font.TrueTypeFont;
import static org.junit.jupiter.api.Assertions.*;
public class misTests
{
        @Test
        void addPilaVacia()
        {
            int resultado=0;
            Calculadora a=new Calculadora();
            resultado=a.add();
            assertTrue(0==resultado);
        }
        @Test
        void addPilaCero()
        {
            int resultado=0;
            Calculadora a=new Calculadora();
            resultado=a.add();
            assertTrue(0==resultado);
        }
        @Test
        void addPilaValores()
        {
            Calculadora a = new Calculadora();
            a.push(4);
            a.push(4);
            a.push(4);
            int resultado;
            resultado = a.add();
            assertTrue(8 == resultado);
        }
        @Test
        void subPilaVacia()
        {
            int resultado=0;
            Calculadora a=new Calculadora();
            resultado=a.sub();
            assertTrue(0==resultado);
        }
        @Test
        void subPilaCero()
        {
            int resultado=0;
            Calculadora a=new Calculadora();
            resultado=a.sub();
            assertTrue(0==resultado);
        }
        @Test
        void subValoresNegativos()
        {
            Calculadora a = new Calculadora();
            a.push(-4);
            a.push(-4);
            a.push(-4);
            int resultado;
            resultado = a.sub();
            assertTrue(0 == resultado);
        }
        @Test
        void subValoresPositivos()
        {
            Calculadora a = new Calculadora();
            a.push(4);
            a.push(4);
            a.push(4);
            int resultado;
            resultado = a.sub();
            assertTrue(0== resultado);
        }
        @Test
        void mulPilaVacia()
        {
            int resultado=0;
            Calculadora a=new Calculadora();
            resultado=a.mul();
            assertTrue(0==resultado);
        }
        @Test
        void mulPilaCero()
        {
            int resultado=0;
            Calculadora a=new Calculadora();
            resultado=a.mul();
            assertTrue(0==resultado);
        }
        @Test
        void mulValoresNegativos()
        {
            Calculadora a = new Calculadora();
            a.push(-4);
            a.push(-4);
            a.push(-4);
            int resultado;
            resultado = a.mul();
            assertTrue(16 == resultado);
        }
        @Test
        void mulValoresPositivos()
        {
            Calculadora a = new Calculadora();
            a.push(4);
            a.push(4);
            a.push(4);
            int resultado;
            resultado = a.mul();
            assertTrue(16 == resultado);
        }
        @Test
        void Writepilavacia()
        {
            Calculadora a=new Calculadora();
            Dato b=new Dato(0, "a");
            a.AgregarMemoria(b);
            a.write("a");
            int numero=0;
            numero=a.getMemoria().get(0).getNumero();
            assertTrue(numero==0);
        }
        @Test
        void WriteDoselementos()
        {
            Calculadora a=new Calculadora();
            Dato b=new Dato(2,"a");
            Dato c=new Dato(0,"b");
            a.AgregarMemoria(b);
            a.AgregarMemoria(c);
            a.write("b");
            int numero=0;
            numero=a.getMemoria().get(0).getNumero();
            assertTrue(numero==0);
        }
        @Test
        void ReadconValor()
        {
            Calculadora a=new Calculadora();
            Dato b=new Dato(2,"a");
            Dato c=new Dato(3,"b");
            a.AgregarMemoria(b);
            a.AgregarMemoria(c);
            a.read("a");
            Integer resultado=0;
            resultado=a.peekvalor();
            assertTrue(resultado== 2);
        }
        @Test
        void ReadsinValores()
        {
            Calculadora a=new Calculadora();
            a.read("b");
            Integer resultado=0;
            resultado=a.peekvalor();
            assertTrue(resultado== 0);
        }
}