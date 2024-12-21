package especialistaJava.section08_trabalhandoComArrays.arrays;

import java.util.Arrays;

public class OrdenandoUmArrayDeFormaNatural {
    public static void main(String[] args) {
        int[] notas = {8, 5, 4, 9, 10};

        Arrays.sort(notas);

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
