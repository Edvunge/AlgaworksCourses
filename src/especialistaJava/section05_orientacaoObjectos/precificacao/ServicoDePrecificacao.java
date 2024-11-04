package especialistaJava.section05_orientacaoObjectos.precificacao;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {

        double precoVendaCalculado = MatematicaUtil.calcularAcrescimo(
            produto.precoCusto, percentualMargemLucro);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }
}
