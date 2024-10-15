package especialistaJava.section03_estruturasControle_E_operadores;

import java.util.Scanner;

public class CaixaLoja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Preço dos produtos: ");
        double precoProduto = input.nextDouble();

        System.out.println("Cobrar Frete:? ");
        boolean cobrarFrete = input.nextBoolean();

        double valorFrete;

        if (cobrarFrete) {
            System.out.println("valor frete: ");
            valorFrete = input.nextDouble();
        } else {
            valorFrete = 0;
        }

        double valorTotal = precoProduto + valorFrete;

        System.out.printf("Valor total: R$%.2\n" , valorTotal);
    }
}
