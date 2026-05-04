package Arreglos;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        System.out.println("Guardando los datos en el arreglo");
        for(int i=0;i<5;i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextFloat();
        }
        int i=0,j=4;
        while(i<j) { //Si i>=j, los índices se cruzan y deshacen los cambios
            float temp;
            temp=numeros[i];
            numeros[i]=numeros[j];
            numeros[j]=temp;
            j--;
            i++;
        }
        System.out.println("Imprimiendo el arreglo invertido");
        for(float a:numeros) {
            System.out.print(a+" ");
        }
    }
}