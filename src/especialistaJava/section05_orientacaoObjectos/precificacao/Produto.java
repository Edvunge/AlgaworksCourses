package especialistaJava.section05_orientacaoObjectos.precificacao;

public class Produto {

    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    double calcularCustosTotais() {
        return this.precoCusto + Produto.custoEmbalagem;
    }

    void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem: %.2f%n", Produto.custoEmbalagem);
    }
}
