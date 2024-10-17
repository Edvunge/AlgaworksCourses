package especialistaJava.section03_estruturasControle_E_operadores;

import java.util.Scanner;

public class ApostaMegasena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidadeNumeros = 0;

        do {
            System.out.println("Quantidade de numeros: ");
            quantidadeNumeros = input.nextInt();

            if (quantidadeNumeros < 6 || quantidadeNumeros > 15) {
                System.out.println("Quantidade de numeros deve ser entre 6 e 15.");
            }
        } while (quantidadeNumeros < 6 || quantidadeNumeros > 15);

        int numeroAtual = 1;
        String numerosEscolhidos = "";

        do {

        } while (numeroAtual <= quantidadeNumeros);
    }
}
