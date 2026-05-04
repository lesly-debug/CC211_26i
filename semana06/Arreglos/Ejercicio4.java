package Arreglos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[10];
        System.out.println("Guardando los datos en el arreglo");
        for(int i=0;i<10;i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i]=entrada.nextFloat();
        }
        System.out.println("\nOrden requerido");
        int i=0;
        int j=9;
        while(i<=j){//Controla hasta cuando recorrer el arreglo desde ambos lados
            if(i==j){
                System.out.print(numeros[i]+" ");
            }else{
                System.out.print(numeros[i]+" ");
                System.out.print(numeros[j]+" ");
            }
            i++;
            j--;
        }
    }
}