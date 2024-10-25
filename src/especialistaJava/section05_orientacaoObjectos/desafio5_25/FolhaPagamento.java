package especialistaJava.section05_orientacaoObjectos.desafio5_25;

public class FolhaPagamento {

    double calcularSalario(ContratoTrabalho contratoTrabalho) {
        //
        int resultado;
        int quantidadeHorasTrabalhadas = quantidadeDeHorasExtrasTrabalhadas + quantidadeDeHorasNormaisTrabalhadas;
        double valorHoras = valorDaHoraExtra + valorDaHoraNormal;
        quantidadeHorasTrabalhadas = (int) (quantidadeHorasTrabalhadas * valorHoras);
        resultado = (int) (quantidadeHorasTrabalhadas + valorHoras);

        return resultado;
    }
}
