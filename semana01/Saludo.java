import java.util.Scanner;
public class Saludo{
public static void main(String[] args){
	Scanner leer=new Scanner(System.in);
	System.out.print("Ingrese la primera cadena: ");
	String cad1=leer.nextLine();
	System.out.println(cad1);
	System.out.print("Ingrese la segunda cadena: ");
	String cad2=leer.nextLine();
	System.out.println(cad2);
	}
}