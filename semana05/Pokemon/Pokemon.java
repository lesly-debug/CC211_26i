package Interfaz.Pokemon;

public abstract class Pokemon {
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    public abstract void atacarPlacaje();
    public abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
}