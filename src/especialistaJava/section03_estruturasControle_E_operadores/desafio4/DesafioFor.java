package especialistaJava.section03_estruturasControle_E_operadores.desafio4;

import java.util.Scanner;

public class DesafioFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
            1) Desafio da estrutura for
            Escreva um programa que solicita 10 números para o usuário e imprime na saída a soma dos números digitados.

            Permita que o usuário digite apenas números pares. Caso um número ímpar seja informado, ignore e solicite um novo número ao usuário.
        */
        int somaNumerosDigitados = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite %dº numero: ",i);
            int num = input.nextInt();

            if (num  % 2 == 0) {
                continue;
            } else {
                System.out.printf("Digite %dº numero: ",i);
                num = input.nextInt();

                somaNumerosDigitados += num;
            }
        }
        System.out.println("A soma dos numeros digitados e de: " + somaNumerosDigitados);
    }
}
