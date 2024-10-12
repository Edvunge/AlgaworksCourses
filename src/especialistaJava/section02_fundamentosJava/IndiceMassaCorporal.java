package especialistaJava.section02_fundamentosJava;

import java.util.Scanner;

public class IndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Peso: ");
        int peso = input.nextInt();

        System.out.println("Altura: ");
        double altura = input.nextDouble();

        input.nextLine();

        System.out.println("Nome: ");
        String nome = input.nextLine();

        double imc = peso / (altura * altura);

        System.out.printf("IMC de %s: %.2f%n", nome ,imc);
        input.close();
    }
}
