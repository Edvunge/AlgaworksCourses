package especialistaJava.section05_orientacaoObjectos;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    void calcularValorRevenda() {
        int tempoDeUsoEmAnos = 2002 - anoFabricacao;

        double valorRenda = (precoCompra / 20) * (20 - tempoDeUsoEmAnos);

        if(valorRenda < 0) {
            valorRenda = 0;
        }

        System.out.printf("Tempo de uso ()anos: %d%n", tempoDeUsoEmAnos);
        System.out.printf("Valor de revenda: %6.2f%n", valorRenda);
    }

}
