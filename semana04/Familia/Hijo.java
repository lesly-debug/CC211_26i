package Familia;

public class Hijo {
    
    private String nombre;
    private int ahorro;
    private Papa pa;
    
    public Hijo(String nombre,Papa pa) {
        this.nombre = nombre;
        this.pa=pa;
    }
    
    public void ahorrar(int monto) {
        ahorro = ahorro + monto;
    }
    
    public void ahorrarPapa(int monto) {
        pa.ahorrar(monto);
    }
    
    public void ahorrarAbuelo(int monto){
        pa.ahorrarAbuelo(monto);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getAhorro() {
        return ahorro;
    }
}