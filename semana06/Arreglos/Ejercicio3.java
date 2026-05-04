package Arreglos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        float sumPositivos=0,sumNegativos=0;
        int numPositivos=0,numNegativos=0,numCeros=0;
        System.out.println("Guardando los datos en el arreglo");
        for(int i=0;i<5;i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i]=entrada.nextFloat();
        }
        for(int i=0;i<5;i++) {
            if(numeros[i]>=0) {
                sumPositivos+=numeros[i];
                numPositivos++;
            }else{
                sumNegativos+=numeros[i];
                numNegativos++;
            }
            if(numeros[i]==0) {
                numCeros++;
            }
        }
        float mediaPositivos,mediaNegativos;
        if(numPositivos==0) {
            System.out.println("No se puede sacar la media de los numeros positivos");
        }else{
            mediaPositivos=sumPositivos/numPositivos;
            System.out.println("Media positivos: "+mediaPositivos);
        }
        if(numNegativos==0) {
            System.out.println("No se puede sacar la media de los numeros negativos");
        }else{
            mediaNegativos=sumNegativos/numNegativos;
            System.out.println("Media negativos: "+mediaNegativos);
        }
        System.out.println("Numero de ceros: "+numCeros);
    }
}