import java.util.ArrayList;
public class Sistema
{
	private ArrayList <laboratorio> laboratorios;
	private ArrayList <experimento> experimentos;
		public boolean LabDisponible()
		{
			int cant=0;
			for(int i=0;int<this.laboratorios.size();i++)
			{
				if(this.laboratorios.get(i).disponibilidad==true)
				{
					return true;
				}
				else
				{
					cant=cant+1;
					if(cant==this.laboratorios.size())
					{
						return false;
					}
				}
			}
		}
	public void Desalojar()
	{
		int cant=0;
		for(int i=0;i<this.laboratorios.size();i++)
		{
			if(this.laboratorios.get(i).experimentoActual.Avanzado()==true)
			{
				this.laboratorios.get(i).Reiniciar();
			}
			else{
				cant=cant+1;
				if(cant==this.laboratorios.get(i).size())
				{
					System.out.println("No hay experimentos avanzados para desalojar.");
				}
			}
		}
	}
	public int CantidadConsistentes()
	{
		int cantidad = 0;
		for (int i=0;i<experimentos.size();i++)
		{
			if (this.experimentos.get(i).Consistente())
			{
				cantidad++;
			}
		}
		return cantidad;
	}
}