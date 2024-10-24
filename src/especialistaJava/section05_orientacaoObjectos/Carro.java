package especialistaJava.section05_orientacaoObjectos;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    void imprimirResumoDepreciacao() {
        double valorRevendaMeuCarro = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
    }

    double calacularIpva() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

        if (tempoDeUsoEmAnos >= 10) {
            return 0;
        }

        return  calcularValorRevenda() * 0.04;
    }


    int calcularTempoDeUsoEmAnos() {
        return 2022 - anoFabricacao;
    }

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
        int vidaUtilEmAnos = 20;

        double valorRenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if(valorRenda < 0) {
            valorRenda = 0;
        }

        System.out.printf("Tempo de uso ()anos: %d%n", tempoDeUsoEmAnos);
        System.out.printf("Valor de revenda: %6.2f%n", valorRenda);

        return valorRenda;
    }

}
