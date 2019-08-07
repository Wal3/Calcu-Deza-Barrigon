public static void main(String[] args) {

Restaurate rest1=new Restaurate("indiano","Alvarez Thomas 1965");

Mesa mesa1 = new Mesa();
Mesa mesa2 = new Mesa();
Mesa mesa3 = new Mesa();
Mesa mesa4 = new Mesa();
Mesa mesa5 = new Mesa();


	Plato p1= new Plato();
	p1.setNombre("Ravioles rellenos con carne");
	p1.setNumMesa(2);
	p1.setNumPedido(4);
	p1.setCant(2);
	mesa2.AgregarPedido(p1);
	rest1.AgregarPedidoPreparar(p1);

	Plato p2= new Plato();
	p2.setNombre("Pizza a la piedra");
	p2.setNumMesa(3);
	p2.setNumPedido(8);
	p2.setCant(1);
	mesa3.AgregarPedido(p2);
	rest1.AgregarPedidoPreparar(p2);

	Plato p3= new Plato();
	p3.setNombre("Arroz primaver");
	p3.setNumMesa(3);
	p3.setNumPedido(2);
	p3.setCant(1);
	mesa3.AgregarPedido(p3);
	rest1.AgregarPedidoPreparar(p3);

	Plato p4= new Plato();
	p4.setNombre("Ravioles rellenos con carne");
	p4.setNumMesa(5);
	p4.setNumPedido(5);
	p4.setCant(1);
	mesa2.AgregarPedido(p1);
	rest1.AgregarPedidoPreparar(p1);



	System.out.print("TEST PlatoMasPedido. Caso nombreDeCaso. ");
   String nombreVar1 ="Ravioles rellenos con carne" ;
   String nombreVar2 = PlatoMasPedido();
System.out.println((nombreVar1==nombreVar2)?"Pasó el test.":"No pasó el test.")


System.out.print("TEST PlatoMenosPedido. Caso nombreDeCaso. ");
   String nombreVar1 = "Pizza a la piedra";
   String nombreVar2 = PlatoMenosPedido();
System.out.println((nombreVar1==nombreVar2)?"Pasó el test.":"No pasó el test.")
}