package casa;

public class Hijo extends Papa {
    int dineroHijo;

    public Hijo(int dineroAbuelo, int dineroPapa, int dineroHijo) {
        this.dineroAbuelo = dineroAbuelo;
        this.dineroPapa   = dineroPapa;
        this.dineroHijo   = dineroHijo;
    }

    public Hijo(int dineroHijo) {
        this.dineroHijo = dineroHijo;
    }

    void comprar(int total) {
        System.out.println("Hijo: Casa comprada al precio de : " + total);
    }
}
