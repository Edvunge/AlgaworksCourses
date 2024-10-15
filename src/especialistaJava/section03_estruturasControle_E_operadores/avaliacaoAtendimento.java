package especialistaJava.section03_estruturasControle_E_operadores;

import java.util.Scanner;

public class avaliacaoAtendimento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Avalie o nosso atendimento (1 a 5): ");
        int nota = input.nextInt();

        String descricaoNota;

        switch (nota) {
            case 1:
                descricaoNota = "Muito ruim";
                break;
            case 2:
                descricaoNota = "Ruim";
                break;
            case 3:
                descricaoNota = "Razoavel";
                break;
            case 4:
                descricaoNota = "Muito bom";
                break;
            case 5:
                descricaoNota = "Excelente";
                break;
            default:
                descricaoNota = "Opcao Invalida";
        }
    }
}
