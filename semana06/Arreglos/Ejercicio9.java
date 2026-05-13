package Arreglos;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros=new int[10];
        int numPares=0,numImpar=0;
        for(int i=0;i<10;i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i]=entrada.nextInt();
        }
        for(int i=0;i<10;i++) {
            if(numeros[i]%2==0){
                numPares++;
            }else{
                numImpar++;
            }
        }
        int[] par = new int[numPares];
        int[] impar = new int[numImpar];
        int k=0,l=0;
        for(int i=0;i<10;i++) {
            if(numeros[i]%2==0){
                par[k]=numeros[i];
                k++;
            }else{
                impar[l]=numeros[i];
                l++;
            }
        }
        System.out.println("Arreglo de pares: ");
        for(int i=0;i<numPares;i++) {
            System.out.print(par[i]+" ");
        }
        System.out.println("\nArreglo de impares: ");
        for(int i=0;i<numImpar;i++) {
            System.out.print(impar[i]+" ");
        }
    }
}