package especialistaJava.section03_estruturasControle_E_operadores;

import java.util.Scanner;

public class ExameVitaminaD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Grupo de risco: ");
        boolean grupoDeRisco = input.nextBoolean();

        System.out.println("Vitamina D: ");
        double vitaminaD = input.nextDouble();

        boolean vitaminaDnormal = grupoDeRisco == false && vitaminaD > 20
                || grupoDeRisco == true && vitaminaD >= 30 && vitaminaD <= 60;

        System.out.printf("Vitamina D normal: %b%n", vitaminaDnormal);
    }
}
