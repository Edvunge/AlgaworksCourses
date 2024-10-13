package especialistaJava.section03_estruturasControle_E_operadores;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ano: ");
        int ano = input.nextInt();

        boolean anoBissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);

        System.out.printf("Bissexto: %b%n", anoBissexto);

        input.close();
    }
}
