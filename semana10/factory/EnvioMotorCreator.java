package factory;
public class EnvioMotorCreator extends EnvioCreator {
    @Override
    protected Envio crearEnvio() {
        return new EnvioMoto();
    }
}