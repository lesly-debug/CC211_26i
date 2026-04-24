package Familia;

public class Papa {
    
    private String nombre;
    private int ahorro;
    private Abuelo ab;
    
    public Papa(String nombre,Abuelo ab) {
        this.nombre=nombre;
        this.ab=ab;
        this.ahorro=0;
    }
    
    public void ahorrar(int monto) {
        ahorro=ahorro+monto;
    }
    
    public void ahorrarAbuelo(int monto) {
        ab.ahorrar(monto);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getAhorro() {
        return ahorro;
    }
    
    public Abuelo getAbuelo() {
        return ab;
    }
    
}