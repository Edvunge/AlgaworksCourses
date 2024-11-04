package especialistaJava.section05_orientacaoObjectos.precificacao;

public class MatematicaUtil {

    static double calcularAcrescimo(double valor, double percential) {
        return valor * ((percential / 100) + 1);
    }

}
