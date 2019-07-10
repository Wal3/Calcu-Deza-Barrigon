import java.util.ArrayList;
public class Laboratorio
{
	private Experimento experimentoActual;
    private int numero;
    private boolean disponibilidad;
    public void Reiniciar()
    {
    	experimentoActual.nombre =null;
    	experimentoActual.numLab=0;
    	experimentoActual.ObservacionConfirmaHipotesis.clear();
    	experimentoActual.ObservacionContradiceHipotesis.clear();
    	experimentoActual.ObservacionAnomala.clear();
    	this.disponibilidad=true;
    }
    public void CancelarProyecto()
    {
    	int observacionesLegitimas = experimentoActual.ObservacionContradiceHipotesis.size() + experimentoActual.ObservacionConfirmaHipotesis.size();
    	if(experimentoActual.ObservacionAnomala.size()>observacionesLegitimas)
    	{
    		this.Reiniciar();
    	}
    	else
    	{
    		break;
    	}
    }
}