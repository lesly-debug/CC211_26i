package factory;
public class Main {
    public static void main(String[] args) {
        EnvioCreator envioCorreo=new EnvioCorreoCreator();
        envioCorreo.procesarEnvio();
        EnvioCreator envioMoto=new EnvioMotorCreator();
        envioMoto.procesarEnvio();
        EnvioCreator envioCamion=new EnvioCamionCreator();
        envioCamion.procesarEnvio();
    }
}