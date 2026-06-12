package factory;

public class EnvioCamionCreator extends EnvioCreator {
    @Override
    protected Envio crearEnvio() { // ¡Asegúrate de que diga 'crearEnvio'!
        return new EnvioCamion();
    }
}