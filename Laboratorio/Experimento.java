import java.util.ArrayList;
import java.util.Scanner;
public class Experimento{
    private String nombre;
    private int laboratorio;
    private ArrayList<String> ObservacionConfirmaHipotesis;
    private ArrayList<String> ObservacionContradiceHipotesis;
    private ArrayList<String> ObservacionAnomala;
    public Experimento(String nombre,int laboratorio){
        this.nombre=nombre;
        this.laboratorio=laboratorio;
        this.ObservacionConfirmaHipotesis= new ArrayList<String>();
        this.ObservacionContradiceHipotesis=new ArrayList<String>();
        this.ObservacionAnomala= new ArrayList<String>();   
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getLaboratorio(){
        return this.laboratorio;
    }
    public void setLaboratorio(int laboratorio){
        this.laboratorio=laboratorio;
    }
   public void AgregarObservacion(String Observacion){
        Scanner myObj = new Scanner(System.in);
        System.out.println("1-Observacion Anomala" + "2-observación legítima que confirma la hipótesis" + "3-observación legítima que contradice la hipótesis");
        int caso = myObj.nextInt();
        switch (caso){
            case 1:
                this.ObservacionAnomala.add(Observacion);
            break;

            case 2:
                this.ObservacionConfirmaHipotesis.add(Observacion);
            break;

            case 3:
                this.ObservacionContradiceHipotesis.add(Observacion);
            break;
        }
    }
    public boolean Avanzado()
    {
    	int observacionesLeg=this.ObservacionContradiceHipotesis.size()+this.ObservacionConfirmaHipotesis.size();
    	if(observacionesLeg>30)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    public boolean Consistente()
    {
    	int observacionesTotales = this.ObservacionConfirmaHipotesis.size()+this.ObservacionContradiceHipotesis.size();
    	if (observacionesTotales<this.ObservacionConfirmaHipotesis.size())
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}