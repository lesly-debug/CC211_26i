package casa2;

public class Hijo extends Papa {
    int dinero;

    public Hijo(int dineroAbu, int dineroPapa, int dinero) {
        super(dineroAbu, dineroPapa);
        this.dinero = dinero;
    }

    public Hijo(int dinero) {
        this.dinero = dinero;
    }

    int dineroPapa() {
        return super.dinero;
    }

    int dineroAbuelo() {
        return ((Abuelo)this).dinero;
    }

    void comprar(int total) {
        System.out.println("Hijo: Casa comprada al precio de : " + total);
    }
}
