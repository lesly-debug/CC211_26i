package Figura;

public class Circulo implements Figura,Dibujable,Rotable {
    
    private double radio;
    
    public Circulo() {
    }
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }
    
    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }
    
    @Override
    public void rotar() {
        System.out.println("Estoy rotando un circulo");
    }
   
}