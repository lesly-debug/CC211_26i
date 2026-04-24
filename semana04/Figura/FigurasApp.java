package Figura;

public class FigurasApp {
    public static void main(String[] args) {
        Circulo c = new Circulo(2);
        Rectangulo r = new Rectangulo(4,2);
        System.out.printf("Circulo : radio = %.3f; area = %.3f; perimetro = %.3f",c.getRadio(),c.area(),c.perimetro());
        System.out.printf("\nRectangulo : largo = %.3f; ancho = %.3f; area = %.3f; perimetro = %.3f",r.getLargo(),r.getAncho(),r.area(),r.perimetro());
    }
}