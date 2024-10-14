package especialistaJava.section03_estruturasControle_E_operadores.desafio3;

import java.util.Scanner;

public class IndiceMassaCorporalMale_OR_female {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu sexo: (F/M)");
        String sexo = input.nextLine();

        System.out.println("Peso: ");
        int peso = input.nextInt();

        System.out.println("Altura: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        if (sexo.equals("m")) {
            System.out.println("sexo masculino");
            boolean abaixoPesoIdeial = imc < 20.7;
            if (abaixoPesoIdeial == true) {
                System.out.println("Abaixo do peso ideial.");
            } else if (imc >= 20.8 && imc < 26.4) {
                System.out.println("No peso ideial.");
            } else if (imc >= 26.5 && imc < 27.8) {
                System.out.println("Um pouco acima do peso.");
            } else if (imc >= 27.9 && imc < 31.1) {
                System.out.println("Acima do peso ideial.");
            } else if (imc >= 31.2) {
                System.out.println("Obeso.");
            }
        } else {
            System.out.println("sexo femenino");
            boolean abaixoPesoIdeial = imc < 19.1;
            if (abaixoPesoIdeial == true) {
                System.out.println("Abaixo do peso ideial.");
            } else if (imc >= 19.1 && imc < 25.8) {
                System.out.println("No peso ideial.");
            } else if (imc >= 25.9 && imc < 27.3) {
                System.out.println("Um pouco acima do peso.");
            } else if (imc >= 27.4 && imc < 32.3) {
                System.out.println("Acima do peso ideial.");
            } else if (imc >= 32.3) {
                System.out.println("Obeso.");
            }
        }

    }
}
