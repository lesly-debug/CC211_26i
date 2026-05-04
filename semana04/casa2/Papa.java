package casa2;

public class Papa extends Abuelo {
    int dinero;

    public Papa() {}

    public Papa(int dineroAbu, int dinero) {
        super(dineroAbu);   // dinero del abuelo
        this.dinero = dinero; // dinero del papá
    }

    void buscar(int total) {
        System.out.println("Papá: Casa encontrada al precio de: " + total);
    }
}
