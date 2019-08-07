public class Sube{
	private int pago;
	private int usos;
	private int metros;

	public Sube (){
		pago=0;
		usos=0;
		metros=0;
	}

	//constructores

	public int getpago(){
		return this.pago;	
	}
	public int getusos(){
		return this.usos;
	}
	public int getmetros(){
		return this.metros;
	}

	public void setpago(int pagoo){
		this.pago=pagoo;
	}
	public void setusos(int usoss){
		this.usos=usoss;
	}
	public void setmetros(int metross){
		this.metros=metross;
	}

	//metodos

	public void resetMetros(){
		metros=0;
	}
	public void resetPago(){
		pago=0;
	}

	public boolean descuento(){
		boolean desc;
			if(usos>25){
				if(metros*0.5/2==pago){
					desc=true;
				}
				else{
					desc=false;
				}
			}
			else{
				desc=true;
			}
		return desc;
	}

	public boolean pagos(){
		boolean pag;
			if(pago!=0){
				pag=true;
			}
			else{
				pag=false;
			}
			return pag;
	}

	public boolean noSePaso(){
		boolean noPaso;
		if (usos>25){
			if(pago>=metros*0.5/2){
				noPaso=true;
			}
			else{
				noPaso=false;
			}
		}
		else{
			if(pago>=metros*0.5){
				noPaso=true;
			}
			else{
				noPaso= false;
			}
		}
		return noPaso;
	}

	public boolean verifico(){
		boolean verif;
		if(descuento()==true & noSePaso()==true & pagos()==true){
			verif=true;
		}
		else{
			verif=false;
		}
		return verif;
	}

}