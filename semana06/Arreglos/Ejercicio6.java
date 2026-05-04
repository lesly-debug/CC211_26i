package Arreglos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros=new int[10];
        boolean creciente=false,decreciente=false;
        for(int i=0;i<10;i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i]=entrada.nextInt();
        }
        for(int i=0;i<9;i++) {
            if(numeros[i]<numeros[i+1]){
                creciente=true;
            }
            if(numeros[i]>numeros[i+1]){
                decreciente=true;
            }
        }
        if(creciente==true&&decreciente==false){
            System.out.println("El arreglo esta en forma creciente.");
        }else if(creciente==false&&decreciente==true){
            System.out.println("El arreglo esta en forma decreciente.");
        }else if(creciente==true&&decreciente==true){
            System.out.println("El arreglo esta desordenado.");  
        }else if(creciente==false&&decreciente==false){
            System.out.println("Tolos los numeros del arreglo son iguales.");
        }
    }
}