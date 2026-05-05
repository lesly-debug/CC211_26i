package Arreglos;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        for(int i=0;i<10;i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i]=entrada.nextInt();
        }
        int ultimo;
        ultimo = numeros[9];
        for(int i=8;0<=i;i--) {
            numeros[i+1]=numeros[i];
        }
        numeros[0] = ultimo;
        for(int i:numeros){
            System.out.println(i+" ");
        }
    }

}