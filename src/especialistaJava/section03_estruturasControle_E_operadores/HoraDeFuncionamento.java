package especialistaJava.section03_estruturasControle_E_operadores;

import java.util.Scanner;

public class HoraDeFuncionamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dia da semana (ex: seg, ter, qua, qui, sex, sab, dom):");
        String diaSemana = input.nextLine();

        System.out.println("Mes: ");
        int mes = input.nextInt();

        System.out.printf("Horário de funcionamento: %s%n", switch (diaSemana) {
            case "seg" -> {
                if (mes == 12) {
                    yield "08:00 às 16:00";
                }
                yield "Fechado";
            }
            case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
            case "sab", "dom" -> "08:00 às 12:00";
            default -> "Dia inválido";
        });
    }
}
