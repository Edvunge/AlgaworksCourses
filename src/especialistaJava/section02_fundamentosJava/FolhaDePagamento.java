package especialistaJava.section02_fundamentosJava;

import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
            Nome (texto)
            Valor por hora (decimal)
            Horas trabalhadas (inteiro)
            Valor dos descontos (decimal)
        */
        System.out.println("Diga Seu Nome: ");
        String nome = input.nextLine();

        System.out.println("Qual o Valor por hora: ");
        double valorPorHora = input.nextDouble();

        System.out.println("Quantas Horas Trabalhas: ");
        int horasTrabalhadas = input.nextInt();

        System.out.println("Qual e o Valor Dos Descontos: ");
        double valorDosDescontos = input.nextDouble();

        double salario = valorPorHora * horasTrabalhadas;
        valorDosDescontos = salario - valorDosDescontos;
        double totalDevido = valorDosDescontos;

        System.out.println("Folha de pagamento: " + nome);
        System.out.println(horasTrabalhadas + " horas  x R$" + valorPorHora + " = R$" + salario);
        System.out.println("Total Devido: R$" + totalDevido);
        /*
        Folha de pagamento: Thiago Faria
        172 horas x R$150.20 = R$25834.40
        Descontos: R$482.88
        Total devido: R$25351.52
        */
    }
}
