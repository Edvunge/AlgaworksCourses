package especialistaJava.section05_orientacaoObjectos.precificacao;

public class Principal {
    public static void main(String[] args) {
        double preco = 140;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.calcularPrecoVenda(preco);

        System.out.printf("Preco: %.2f%n", preco);
    }
}
