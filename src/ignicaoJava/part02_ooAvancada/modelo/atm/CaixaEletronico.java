package ignicaoJava.part02_ooAvancada.modelo.atm;

import ignicaoJava.part02_ooAvancada.modelo.Conta;
import ignicaoJava.part02_ooAvancada.modelo.ContaInvestimento;
import ignicaoJava.part02_ooAvancada.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {

    public void imprimirSaldo(ContaInvestimento conta) {
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getSaldo());
        System.out.println("Saldo: " + conta.getSaldo());

    }

    public void pagar(DocumentoPagavel documento, Conta conta) {
        if () {

        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }
}
