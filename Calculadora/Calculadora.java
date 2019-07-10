import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Stack;
public class Calculadora
{
  private  Stack<Integer> valores;
  private Programa nombreP;
  private  ArrayList<Dato> memoria;
  public Calculadora()
  {
    this.valores = new Stack <Integer>();
    this.nombreP = new Programa();
    this.memoria = new ArrayList<Dato>();
  }
    public Stack<Integer> getValores()
    {
        return valores;
    }
	    public Integer peekvalor()
	    {
	    	return this.valores.peek();
	    }
	    public void AgregarMemoria(Dato numero)
	    {
	    	this.memoria.add(numero);
	    }
	    public void push(int numero)
	    {
	        this.valores.push(numero);
    }
    public ArrayList<Dato> getMemoria()
    {
    	return this.memoria;
    }
    public int add()
    {
        int resultado=0;
        int x=0;
        int y=0;
        if(this.valores.empty()==true)
        {
            x=0;
            y=0;
            resultado=x+y;
        }
        else{
            x=this.valores.peek();
            this.valores.pop();
            y=this.valores.peek();
            resultado=x+y;
            this.valores.push(x);
        }
        return resultado;
    }
   public int sub()
   {
        int resultado=0;
        int x=0;
        int y=0;
        if(this.valores.empty()==true)
        {
            x=0;
            y=0;
            resultado=x+y;
        }
        else
        {
            x=this.valores.peek();
            this.valores.pop();
            y=this.valores.peek();
            resultado=y-x;
            this.valores.push(x);
        }
        return resultado;
    }
    public int mul()
    {
	    int resultado=0;
	    int x=0;
	    int y=0;
	    if(this.valores.empty()==true)
	    {
	        x=0;
	        y=0;
	        resultado=x+y;
	    }
	    else
	    {
	        x=this.valores.peek();
	        this.valores.pop();
	        y=this.valores.peek();
	        resultado=x*y;
	        this.valores.push(x);
	    }
	    return resultado;
    }
   public void write(String nuevo)
   {
        if(true==this.valores.empty())
        {
            this.memoria.get(0).setNumero(0);
        }
       for (int i=0;i<this.memoria.size();i++)
       {
           if(nuevo.equals(this.memoria.get(i).getLetra()))
           {
               this.memoria.get(i).setNumero(this.valores.peek());
               if (!this.valores.empty())
               {	
               		this.valores.pop();
               }
           }
       }
  }
    public void read(String nuevo)
    {
        if (memoria.isEmpty() == true)
        {
            this.valores.push(0);
        } else {
            for (int i = 0; i < this.memoria.size(); i++)
            {
                if (this.memoria.get(i).getLetra().equals(nuevo))
                {
                    this.valores.push(this.memoria.get(i).getNumero());
                }
            }
        }
    }
    public void cargarP(Programa nuevoP)
    {
        this.nombreP = nuevoP;
    }
    public void ejec(String rutina)
    {
        for(int i=0;i<this.nombreP.getInstrucciones().size();i++)
        {
            if(this.nombreP.getInstrucciones().get(i).getRutina()==rutina)
            {
                if (this.nombreP.getInstrucciones().get(i).getNombreOperacion() == "push")
                {
                    this.push(this.nombreP.getInstrucciones().get(i).getValor());
                }
                if (this.nombreP.getInstrucciones().get(i).getNombreOperacion() == "add")
                {
                    this.add();
                }
                if (this.nombreP.getInstrucciones().get(i).getNombreOperacion() == "sub")
                {
                    this.sub();
                }
                if (this.nombreP.getInstrucciones().get(i).getNombreOperacion() == "mul")
                {
                    this.mul();
                }
                if (this.nombreP.getInstrucciones().get(i).getNombreOperacion() == "write")
                {
                    this.write(this.nombreP.getInstrucciones().get(i).getNombreVariable());
                }
                if (this.nombreP.getInstrucciones().get(i).getNombreOperacion() == "read")
                {
                    this.read(this.nombreP.getInstrucciones().get(i).getNombreVariable());
                }
            }
        }
    }
  }