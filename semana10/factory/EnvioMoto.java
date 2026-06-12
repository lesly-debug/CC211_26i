package factory;
public class EnvioMoto implements Envio {
    @Override
    public void enviarPaquete() {
        System.out.println("Enviando paquete mediante moto de reparto rápido...");
    }
}