import java.util.ArrayList;

public class Plato{

	private String Nombre;
	private int NumMesa;
	private int NumPedido;
	private int Cant;

	public Plato(String nombrex,int nummesax,int numpedidox,int cantx){
		Nombre=nombrex;
		NumMesa=nummesax;
		NumPedido=numpedidox;
		Cant=cantx;	
	}
}


public int numPedido(){
 int pedidonum=this.getNumPedido();
 return pedidonum;
}

public int consultarMesa(){
	int mesanum=this.getNumMesa();
	return mesanum;
}

public int cantPlato(){
int platocant=this.getCant();
return platocant;
}

public int getNombre(){
	int nom = this.getNombre();
	return nom;
}