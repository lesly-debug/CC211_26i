package singleton;
public class Configuracion {
    private static Configuracion instancia;
    private Configuracion() {//constructor privado
        System.out.println("Inicializando configuracion en el sistema");
    }
    public static Configuracion getInstancia() {//metodo publico que sea estatico
        if(instancia==null){
            instancia=new Configuracion();
        }
        return instancia;
    }
    public void mostrarMensaje() {//metodo del singlaton
        System.out.println("Configuracion activa");
    }
}