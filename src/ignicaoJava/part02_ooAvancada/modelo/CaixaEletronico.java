package ignicaoJava.part02_ooAvancada.modelo;

public class CaixaEletronico {

    public void imprimirSaldo(ContaInvestimento conta) {
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getSaldo());
        System.out.println("Saldo: " + conta.getSaldo());

    }
}
