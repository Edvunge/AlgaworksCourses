package logicaProgramacaoComJava.capitulo11_02_bibliotecas;

import AlgaworksBlack.logicaProgramacaoComJava.capitulo11_01_othersProgrammers.AlgaworksConsole.Interacao;

public class BibliotecaPropria {
    public static void main(String[] args) {
        Interacao interacao = new Interacao();

        Integer numero = interacao.lerNumero("Digite um número: ");
        interacao.imprimir("Número: " + numero);

        Double decimal = interacao.lerDecimal("Digite um número decimal: ");
        interacao.imprimir("Decimal: " + decimal);

        interacao.erro("Essa é uma mensagem de erro!");

        interacao.fechar();
    }
}
