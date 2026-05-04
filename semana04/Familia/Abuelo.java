package Familia;

public class Abuelo {
    
    private String nombre;
    private int ahorro;
    
    public Abuelo(String nombre) {
        this.nombre = nombre;
        this.ahorro = 0;
    }
    
    public void ahorrar(int monto) {
        ahorro = ahorro+monto;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getAhorro() {
        return ahorro;
    }
    
}