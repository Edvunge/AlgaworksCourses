package especialistaJava.section05_orientacaoObjectos;

public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;

    boolean estaComObesidade() {
        return resultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeial() {
        return  resultado < 18.5;
    }
}
