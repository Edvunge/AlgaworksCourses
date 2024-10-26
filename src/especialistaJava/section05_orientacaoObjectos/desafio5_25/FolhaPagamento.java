package especialistaJava.section05_orientacaoObjectos.desafio5_25;

public class FolhaPagamento {

    double calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contratoTrabalho) {
        double valorHorasNormais = horasNormais * contratoTrabalho.valorHoraNormal;
        double valorHorasExtras = horasExtras * contratoTrabalho.valorHoraExtra;

        double valorTotal = valorHorasNormais + valorHorasExtras;

        if (contratoTrabalho.possuiAdicionalParaFilhos()) {
            valorTotal *= 1.10;
        }

        return valorTotal;
    }
}
