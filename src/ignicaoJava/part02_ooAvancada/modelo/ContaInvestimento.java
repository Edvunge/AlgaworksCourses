package ignicaoJava.part02_ooAvancada.modelo;

public class ContaInvestimento extends Conta {


    public ContaInvestimento (Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);

    }

    @Override
    public void debitarTarifaMensal() {

    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        depositar(valorRendimentos);
    }
}
