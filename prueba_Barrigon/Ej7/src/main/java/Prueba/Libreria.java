package Prueba;
import java.util.HashMap;
import java.util.HashSet;
public class Libreria{
    private HashSet <Libro> listaLibros = new HashSet<Libro>();
    private HashMap <Editorial, Integer> ventasPorEditorial = new HashMap<Editorial, Integer>();
    public Libreria(){
    }
    public HashSet<Libro> getListaLibros() {
        return listaLibros;
    }
    public void setListaLibros(HashSet<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    public HashMap<Editorial, Integer> getVentasPorEditorial() {
        return ventasPorEditorial;
    }
    public void setVentasPorEditorial(HashMap<Editorial, Integer> ventasPorEditorial) {
        this.ventasPorEditorial = ventasPorEditorial;
    }
    public void setVentas(){
        ventasPorEditorial.put(Editorial.ALIANZA, 0);
        ventasPorEditorial.put(Editorial.ATLÁNTIDA, 0);
        ventasPorEditorial.put(Editorial.ELATENEO, 0);
        ventasPorEditorial.put(Editorial.INTERZONA, 0);
        ventasPorEditorial.put(Editorial.KAPELUZ, 0);
        ventasPorEditorial.put(Editorial.SUDAMERICA, 0);
        ventasPorEditorial.put(Editorial.SUR, 0);
    }
    public void addLibro(Libro x){
        listaLibros.add(x);
        ventasPorEditorial.put(x.getEditorial(), ventasPorEditorial.get(x.getEditorial())+1);
    }
    public int getVentasPorEditorial(Editorial x){
        return ventasPorEditorial.get(x);
    }
    public Editorial topVentas(){
        Editorial[] editoriales = Editorial.values();
        int x = ventasPorEditorial.get(editoriales[0]);
        Editorial e = editoriales[0];
        for(int i = 1; i != ventasPorEditorial.size(); i++){
            if(ventasPorEditorial.get(editoriales[i]) > x){
                x = ventasPorEditorial.get(editoriales[i]);
                e = editoriales[i];
            }
        }
        return e;
    }
}