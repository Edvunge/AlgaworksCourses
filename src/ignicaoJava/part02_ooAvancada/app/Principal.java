package ignicaoJava.part02_ooAvancada.app;


import ignicaoJava.part02_ooAvancada.modelo.Conta;
import ignicaoJava.part02_ooAvancada.modelo.ContaEspecial;
import ignicaoJava.part02_ooAvancada.modelo.ContaInvestimento;
import ignicaoJava.part02_ooAvancada.modelo.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da Silva");
        titular1.setDocumento("12312312311");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("22233344455");

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 987);
        ContaEspecial suaConta = new ContaEspecial(titular2, 222, 333, 1_000);

        minhaConta.depositar(15_000);
        minhaConta.sacar(1_000);

        minhaConta.creditarRendimentos(0.8);

        suaConta.depositar(15_000);
        minhaConta.sacar(15_000);

        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());
    }
}