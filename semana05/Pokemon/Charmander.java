package Interfaz.Pokemon;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }
    
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");
    }
    
    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque araniazo");
    }
    
    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque punio fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola soy Charmander y este es mi ataque lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque ascuas");
    }
    
}