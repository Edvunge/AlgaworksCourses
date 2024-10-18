package especialistaJava.section03_estruturasControle_E_operadores.desafio4;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            3) Desafio da estrutura while
            Escreva um programa que solicita números inteiros ao usuário de forma contínua e soma todos os números informados.

            O programa deve parar de solicitar mais números e imprimir a soma deles na saída apenas quando o valor total somado for igual ou superior a 100.
        */

        int somaNumerosDigitados = 0;

        while (somaNumerosDigitados <= 100) {
            System.out.println("Digite os numeros: ");
            int num = input.nextInt();

            somaNumerosDigitados += num;
        }

        System.out.println("A Soma de todos os numeros eh: "+ somaNumerosDigitados);
    }
}
