package especialistaJava.section05_orientacaoObjectos.portaria;

public class CadastroPortaria {

    void cadastrar(Visitante visitante, int tempoExpiracaoEmMeses) {
        final int tempoExpiracaoEmDias;
        tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias%n", visitante.nome, tempoExpiracaoEmDias);
    }
}
