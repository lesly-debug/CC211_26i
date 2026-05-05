package Arreglos;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        System.out.println("Llenando el arreglo");
        int numero,indNumero=0,j=0;
        boolean creciente=true;
        do{
            for(int i=0;i<5;i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i]=entrada.nextInt();
            }
            for(int i=0;i<4;i++) {
                if(arreglo[i]<arreglo[i+1]){
                    creciente=true;
                }
                if(arreglo[i]>arreglo[i+1]){
                    creciente=false;
                    break;
                }
            }
            if(creciente==false){
                System.out.println("\nEl arreglo no esta ordenado en forma creciente, vuelva a insertar.\n");
            }
        }while(creciente==false);
        System.out.print("\nDigite un elemento a insertar: ");
        numero=entrada.nextInt();
        while(arreglo[j]<numero&&j<5){
            indNumero++;
            j++;
        }
        for(int i=4;i>=indNumero;i--) {
            arreglo[i+1]=arreglo[i];
        }
        arreglo[indNumero]=numero;
        System.out.print("\nArreglo final: ");
        for(int i=0;i<6;i++) {
            System.out.print(arreglo[i]+" ");
        }
    }
}