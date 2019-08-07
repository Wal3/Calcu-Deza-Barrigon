import java.util.ArrayList;

public class Restaurante{
	private ArrayList<Mesa> messa = new ArrayList<Mesa>();

	private String nombre;
	private String direccion;

	public Restaurate(int nombrex, int direccionx){
		nombre=nombrex;
		direccion=direccionx;
	}

}

public void AgregarMesa(){
	this.messa= this.getmessa()+1;
}

public void desocuparMesa(){
this.messa.clear();
}

public int PlatoMasPedido(){
	private ArrayList<Integer> num = new ArrayList<Integer>();
	for(int a=0;a<messa.size();a++){
		for(int p=0;p<pedido.size();p++){
			int mayorc=num.get(0);
			String mayorp=messa.get(0).getPedido().get(0).getNombre();
				if(num.get(p)>mayorc){
					mayorc=num.get(p);
					mayorp=messa.get(a).getPedido().get(p).getNombre();
				}
		}
	}
	return mayorp;
}

public int PlatoMenosPedido(){
	private ArrayList<Integer> num = new ArrayList<Integer>();
	for(int a=0;a<messa.size();a++){
		for(int p=0;p<pedido.size();p++){
			int menorc=num.get(0);
			String menorp=messa.get(0).getPedido().get(0).getNombre();
				if(num.get(p)<menorc){
					menorc=num.get(p);
					menorp=messa.get(a).getPedido().get(p).getNombre();
				}
		}
	}
	return menorp;
}





