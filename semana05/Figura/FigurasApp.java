package Figura;

public class FigurasApp {
    
    public static void main(String[] args) {
        Circulo cl=new Circulo(2);
        Cuadrado cr=new Cuadrado(4);
        System.out.println("---Circulo---");
        System.out.println("Area: "+cl.calcularArea());
        cl.dibujar();
        cl.rotar();
        System.out.println("---Cuadrado---");
        System.out.println("Area: "+cr.calcularArea());
        cr.dibujar();
    }
}