package especialistaJava.section03_estruturasControle_E_operadores;

import java.util.Scanner;

public class ExameCortisol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu Cortisol: ");
        double cortisol = input.nextDouble();

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        System.out.printf("Cortisol Normal: %b%n" ,resultadoNormal);

        input.close();
    }
}
