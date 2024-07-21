package logicaProgramacaoComJava.capitulo09_poo.exercicio02;

public class Loja {

    /*
        Faça exatamente como no exercício passado, só que agora torne o método, que verifica a necessidade de repor estoque, como um método de instância.

Lembre-se de que ele não precisará mais receber parâmetros, pois, usará as próprias variáveis de instância da classe Produto.
    */

    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

    String nome;

    Integer quantidadeEstoque;

    Boolean eNecessarioReporEstoque() {
        if (quantidadeEstoque < QUANTIDADE_MINIMA_ESTOQUE) {
            return true;
        }

        return false;
    }
}
