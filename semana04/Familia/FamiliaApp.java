package Familia;
import java.util.Random;

public class FamiliaApp {
    public static void main(String[] args) {

        Random rand = new Random();

        Abuelo ab = new Abuelo("Abuelo");
        Papa pa = new Papa("Papa", ab);
        Hijo hijo1 = new Hijo("Hijo1", pa);
        Hijo hijo2 = new Hijo("Hijo2", pa);

        int totalAbuelo = 0, totalPapa = 0, totalH1 = 0, totalH2 = 0;

        System.out.println("Contribuciones en miles de soles");
        System.out.println("Cuota Abuelo Papa Hijo1 Hijo2 Total");

        for (int i = 1; i <= 4; i++) {

            int a = rand.nextInt(10) + 1;
            int p = rand.nextInt(11) + 10;
            int h1 = rand.nextInt(11) + 30;
            int h2 = rand.nextInt(11) + 20;

            ab.ahorrar(a);
            pa.ahorrar(p);
            hijo1.ahorrar(h1);
            hijo2.ahorrar(h2);

            int total = a + p + h1 + h2;

            totalAbuelo += a;
            totalPapa += p;
            totalH1 += h1;
            totalH2 += h2;

            System.out.println(i + " " + a + " " + p + " " + h1 + " " + h2 + " " + total);
        }

        int totalGeneral = totalAbuelo + totalPapa + totalH1 + totalH2;

        System.out.println("Total " + totalAbuelo + " " + totalPapa + " " + totalH1 + " " + totalH2 + " " + totalGeneral);

        int precioCasa = 300;

        if (totalGeneral >= precioCasa) {
            int saldo = totalGeneral - precioCasa;
            System.out.println("Saldo remanente en hijo1: " + saldo + ".");
            System.out.println("Felicidades por la nueva casa.");
            System.out.println("Se lo merecen.");
        }
    }
}