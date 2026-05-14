package parcial;

import java.util.Random;
import java.util.LinkedList;

class Bus {
    Random ran = new Random();
    
    int paradas;
    float[] precios;
    int nprecios;
    
    int[] suben;
    int[] bajan;
    
    int pasajeros = 0;
    int totalPasajeros = 0;
    float totalDinero = 0;
    
    LinkedList<Pasajero> list = new LinkedList<>();
    
    Bus(int paradas,float[] precios) {
        this.paradas = paradas;
        this.precios = precios;
        nprecios = precios.length;
        
        suben = new int[paradas];
        bajan = new int[paradas];
    }
    public void viajar() {
        subir(0);
        for(int i=1;i<paradas-1;i++) {
            bajar(i);
            subir(i);
        }
        bajar(paradas-1);
    }
    void subir(int i){
        suben[i] = ran.nextInt(11);
        for(int j=0;j<suben[i];j++) {
            float precio = precios[ran.nextInt(nprecios)];
            
            Pasajero p = new Pasajero(precio);
            list.add(p);
            
            pasajeros++;
            totalPasajeros++;
            totalDinero=totalDinero+precio;
        }
    }
    void bajar(int i){
        bajan[i] = Math.min(pasajeros,ran.nextInt(11));
        for(int j=0;j<bajan[i];j++) {
            list.removeFirst();
            pasajeros--;
            totalPasajeros--;
        }
    }
}

class Pasajero {
    float precio;
    public Pasajero(float precio){
        this.precio = precio;
    }
}

public class ViajeApp {
    public static void main(String[] args) {
        Random ran = new Random();
        float[] precios={1,1.5f,2,2.5f,3};
        System.out.println("Viaje virtual en bus virtual");
        System.out.println("Parada\tSuben\tBajan");
        Bus bus = new Bus(3+ran.nextInt(4),precios);
        bus.viajar();
        for(int i=0;i<bus.paradas;i++) {
            System.out.println("\t"+(i+1)+"\t"+bus.suben[i]+"\t"+bus.bajan[i]);
        }
        System.out.println("\nTotal pasajeros que suben/bajan: "+bus.totalPasajeros);
        System.out.println("Total dinero: "+bus.totalDinero);
    }
}