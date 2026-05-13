package Arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Insercion {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[],nElementos,pos,aux;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
        numeros = new int[nElementos];
        for(int i=0;i<nElementos;i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i]=entrada.nextInt();
        }
        for(int i=0;i<nElementos-1;i++) {
            pos=i;
            aux=numeros[i];
            while((pos>0)&&(numeros[pos-1]>aux)){
                numeros[pos]=numeros[pos-1];
                pos--;
            }
            numeros[pos]=aux;
        }
        System.out.println("\nOrden en forma creciente");
        for(int i=0;i<nElementos;i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("\nOrden en forma decreciente");
        for(int i=nElementos-1;0<=i;i--) {
            System.out.print(numeros[i]+" ");
        }
    }
}