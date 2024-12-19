package especialistaJava.section08_trabalhandoComArrays.arrays;

public class Main {
    public static void main(String[] args) {
        int[] notas = {8, 5, 4, 9, 10};

        double media = Calculadora.calcularMedia(notas);

        System.out.println(media);
    }
}
