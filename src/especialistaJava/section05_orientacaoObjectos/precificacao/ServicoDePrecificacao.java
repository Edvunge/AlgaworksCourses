package especialistaJava.section05_orientacaoObjectos.precificacao;

public class ServicoDePrecificacao {
    /*void calcularPrecoVenda(double precoCusto) {
        // TODO Implementar

    }*/

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
    }
}
