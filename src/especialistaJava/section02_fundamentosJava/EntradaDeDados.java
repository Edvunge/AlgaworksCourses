package especialistaJava.section02_fundamentosJava;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.next();

        System.out.println("O seu nome: " + nome);

        input.close();
    }
}
