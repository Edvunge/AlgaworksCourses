package especialistaJava.section08_trabalhandoComArrays.arrays;

import java.util.Arrays;

public class ArraysDeStrings {
    public static void main(String[] args) {
        int[] notas = {8, 5, 4, 9, 10};

        String notasEmStrings = Arrays.toString(notas);

        System.out.println(notasEmStrings);
    }
}
