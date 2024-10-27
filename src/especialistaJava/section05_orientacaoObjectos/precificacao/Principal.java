package especialistaJava.section05_orientacaoObjectos.precificacao;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.precoCusto = 100;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(produto, 20);

        System.out.printf("Preco: %.2f%n", produto.precoVenda);
    }
}
