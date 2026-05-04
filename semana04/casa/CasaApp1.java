package casa;

public class CasaApp1 {
    public static void main(String[] args) {

        Hijo hijo = new Hijo(40, 60, 80);
        Hijo hermano = new Hijo(100);

        int total = hijo.dineroAbuelo + hijo.dineroPapa
                  + hijo.dineroHijo + hermano.dineroHijo;

        Papa papa = new Papa(); // ✔ correcto (quien ejecuta buscar)

        papa.buscar(total);
        hijo.comprar(total);

        System.out.println("Felicitaciones por la nueva casa!!!");
    }
}
