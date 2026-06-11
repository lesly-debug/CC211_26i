package singleton;
public class Main {
    public static void main() {
        System.out.println("Modulo de autenticacion");
        Configuracion config1=Configuracion.getInstancia();
        config1.mostrarMensaje();
        System.out.println("Modulo de reportes");
        Configuracion config2=Configuracion.getInstancia();
        config2.mostrarMensaje();
        System.out.println(config1==config2);
    }
}