package Figura;

public class Circulo extends Figuras {
    
    private double radio;
    
    public Circulo() {
    }
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    @Override
    public double area() {
        return Math.PI*radio*radio;
    }
    
    @Override
    public double perimetro(){
        return 2*Math.PI*radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
}