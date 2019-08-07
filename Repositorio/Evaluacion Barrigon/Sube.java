import java.util.ArrayList;

public class Sube
{
	private int viajesHechos;
	private float metrosDisponibles,metrosRecorridos,pagado;

	public Sube()
	{
		this.viajesHechos=0;
		this.metrosDisponibles=0;
		this.metrosRecorridos=0;
	}

	public void setViajesHechos(int newViajesHechos)
	{
		this.viajesHechos=newViajesHechos;
	}
	public void setMetrosDisponibles(float newMetrosDisponibles)
	{
		this.metrosDisponibles=newMetrosDisponibles;
	}
	public void setMetrosRecorridos(float newMetrosRecorridos)
	{
		this.metrosRecorridos=newMetrosRecorridos;
	}

	public int getViajesHechos()
	{
		return this.viajesHechos;
	}
	public float getMetrosDisponibles()
	{
		return this.metrosDisponibles;
	}
	public float getMetrosRecorridos()
	{
		return this.metrosRecorridos;
	}

	public void pagarViaje(float pagado)
	{
		if (viajesHechos>25){
			this.metrosDisponibles = pagado/0.25f;
		}else{
			this.metrosDisponibles = pagado/0.50f;
		}
		this.viajesHechos += 1;
		this.metrosRecorridos = 0;
	}
	public boolean orden(){
		if(metrosDisponibles<metrosRecorridos){
			return false;
		}else{
			return true;
		}
	}
}