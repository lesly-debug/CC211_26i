import java.util.Scanner;
public class Factura{
    public static void main(String[] args) { 
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Código de producto, cantidad y precio del producto: ");
        String codigo = leer.next();
        int cantidad = leer.nextInt();
        double precio = leer.nextDouble();
        
        double total = cantidad * precio;
        
        System.out.println("\n" + codigo + ": " + precio + " x " + cantidad + " = " + total);
    	}
}
