package Figura;

public class Rectangulo extends Figuras {
    
    private double largo;
    private double ancho;
    
    public Rectangulo() {
    }
    
    public Rectangulo(double largo,double ancho) {
        this.ancho=ancho;
        this.largo=largo;
    }
    
    @Override
    public double area() {
        return largo*ancho;
    }
    
    @Override
    public double perimetro() {
        return 2*(largo+ancho);
    }
    
    public double getLargo() {
        return largo;
    }
    
    public double getAncho() {
        return ancho;
    }
}