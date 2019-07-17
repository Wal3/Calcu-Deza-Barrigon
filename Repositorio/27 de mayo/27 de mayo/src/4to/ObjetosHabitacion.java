package habitacion;
public class ObjetosHabitacion {
    private String color;
    private String material;
    private double peso;
public ObjetosHabitacion(String material,double peso,String color){
	this.material=material;
	this.peso=peso;
	this.color=color;
}
public String getMaterial(){
    return this.material;
}
public String getColor(){
    return this.color;
}
public void setMaterial(String material){
    this.material=material;
}
public void setPeso(double peso){
    this.peso=peso;
}
public void setColor(String color){
	this.color=color
}