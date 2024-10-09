package especialistaJava.section02_fundamentosJava.tiposPrimitivos;

public class ConversaoDoubleParaInt {
    public static void main(String[] args) {
        double largura = 100;
        //int tamanho = largura; nao compila

        int tamanho = (int) largura;

        System.out.println(tamanho);
    }
}
