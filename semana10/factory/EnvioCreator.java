package factory;
public abstract class EnvioCreator {
    protected abstract Envio crearEnvio();
    public void procesarEnvio() {
        Envio envio=crearEnvio();
        envio.enviarPaquete();
    }
}