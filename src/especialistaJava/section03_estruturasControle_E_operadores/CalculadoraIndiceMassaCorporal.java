package especialistaJava.section03_estruturasControle_E_operadores;

import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Peso: ");
        int peso = input.nextInt();

        System.out.println("Altura: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        boolean abaixoPesoIdeial = imc < 18.5;

        if (abaixoPesoIdeial == true) {
            System.out.println("Abaixo do peso ideial.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Acima do Peso.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade Grau I.");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade Grau II.");
        } else if (imc >= 40) {
            System.out.println("Obesidade Grau III.");
        }

        System.out.println("Fim do programa");
    }
}
