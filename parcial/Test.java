package parcial;

import java.util.Random;
import java.util.Arrays;

class Rectangulo implements Cloneable {

    int largo;
    int ancho;

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public Rectangulo clone() throws CloneNotSupportedException {
        return (Rectangulo) super.clone();
    }
}

class CR implements Comparable<CR>, Cloneable {

    static int orden;

    int radio;
    String color;
    Rectangulo r;

    public CR(int radio, String color, Rectangulo r) {
        this.radio = radio;
        this.color = color;
        this.r = r;
    }

    public float area() {
        return (float) (Math.PI * radio * radio);
    }

    @Override
    public String toString() {
        return radio + "\t" + color + "\t" +
               area() + "\t" + r.largo + "\t" + r.ancho;
    }

    @Override
    public CR clone() throws CloneNotSupportedException {

        CR copia = (CR) super.clone();

        // clonacion profunda
        copia.r = r.clone();

        return copia;
    }

    @Override
    public int compareTo(CR c) {

        switch (orden) {

            case 0 -> {
                return Float.compare(c.area(), this.area());
            }

            case 1 -> {
                return this.color.compareTo(c.color);
            }

            case 2 -> {
                return c.color.compareTo(this.color);
            }
        }

        return 0;
    }
}

public class Test {

    public static void print(CR[] crs, String titulo) {

        System.out.println(titulo);

        System.out.println(
        "Radio\tColor\tArea\t\tLargo\tAncho");

        for (CR c : crs) {
            System.out.println(c);
        }
    }

    public static void main(String[] args)
    throws CloneNotSupportedException {

        Random ran = new Random();

        String[] colores =
        {"blanco", "rojo", "azul"};

        CR cr =
        new CR(1, "blanco",
        new Rectangulo(2, 1));

        CR[] crs =
        new CR[1 + ran.nextInt(8)];

        for (int i = 0; i < crs.length; i++) {

            crs[i] = cr.clone();
        }

        print(crs, "\nCirculos clonados");

        for (CR c : crs) {

            c.radio = 1 + ran.nextInt(4);

            c.color =
            colores[ran.nextInt(3)];

            c.r.largo =
            1 + ran.nextInt(3);

            c.r.ancho =
            1 + ran.nextInt(3);
        }

        print(crs,
        "\nCambios de radio, color, largo y ancho");

        CR.orden = 0;

        Arrays.sort(crs);

        print(crs,
        "\nCirculos ordenados descendentemente por area");

        CR.orden = 1;

        Arrays.sort(crs);

        print(crs,
        "\nCirculos ordenados ascendentemente por color");

        CR buscado =
        new CR(0, "blanco",
        new Rectangulo(0, 0));

        int n =
        Arrays.binarySearch(crs, buscado);

        if (n >= 0) {

            System.out.println(
            "Un circulo de color blanco esta en la posicion: " + n);
        }
        else {

            System.out.println(
            "No hay circulo blanco");
        }

        CR.orden = 2;

        Arrays.sort(crs);

        print(crs,
        "\nCirculos ordenados descendentemente por color");

        n = Arrays.binarySearch(crs, buscado);

        if (n >= 0) {
            System.out.println(
            "Un circulo de color blanco esta en la posicion: " + n);
        }
        else {
            System.out.println(
            "No hay circulo blanco");
        }
    }
}