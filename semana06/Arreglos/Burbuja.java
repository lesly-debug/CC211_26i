package Arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Burbuja {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        arreglo = new int[nElementos];
        for(int i=0;i<nElementos;i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        for(int i=0;i<nElementos-1;i++) {
            for(int j=0;j<nElementos-1;j++) {
                if(arreglo[j]>arreglo[j+1]) {
                    int aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        System.out.println("\nArreglo ordenado en forma creciente: ");
        for(int i=0;i<nElementos;i++) {
            System.out.print(arreglo[i]+"  ");
        }
        System.out.println("\n");
        System.out.println("Arreglo ordenado en forma decreciente: ");
        for(int i=nElementos-1;0<=i;i--) {
            System.out.print(arreglo[i]+" ");
        }
    }
}