package Arreglos;

import java.util.Scanner;

public class Busqueda {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int numero;
        boolean creciente=true;
        do {
            System.out.println("Rellene el arreglo: ");
            for(int i=0;i<10;i++) {
            System.out.print(i+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
            }
            for(int i=0;i<9;i++) {
                if(arreglo[i]<arreglo[i+1]) {
                    creciente=true;
                }
                if(arreglo[i]>arreglo[i+1]){
                    creciente=false;
                    break;
                }
            }
            if(creciente==false){
                System.out.println("El arreglo esta desordenado, digite nuevamente: \n");
            }
        }while(creciente==false);
        System.out.print("\nDigite el numero a buscar en el arreglo: ");
        numero=entrada.nextInt();
        int i=0;
        while(i<10&&arreglo[i]<numero){
            i++;
        }
        if(i==10){
            System.out.println("\nNumero no encontrado");
        }else{
            if(arreglo[i]==numero){
                System.out.println("\nNumero encontrado, en la posicion: "+i);
            }else{
                System.out.println("Numero no encontrado");
            }
        }
    }
}