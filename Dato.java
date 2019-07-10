import java.util.ArrayList;
import java.util.Stack;
public class Dato
{
    private String letra;
    private int num;
    public Dato(int num,String letra)
    {
        this.letra=letra;
        this.num=num;
   }
    public void setNumero(int num)
    {
        this.num = num;
    }
    public void setLetra (String letra)
    {
        this.letra = letra;
    }
    public int getNumero()
    {
        return this.num;
    }
    public String getLetra()
    {
        return this.letra;
    }
}