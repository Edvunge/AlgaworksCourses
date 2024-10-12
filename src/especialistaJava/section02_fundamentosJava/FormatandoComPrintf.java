package especialistaJava.section02_fundamentosJava;

public class FormatandoComPrintf {
    public static void main(String[] args) {
        String nome1 = "Thiago";

        System.out.printf("Ola, %s\n" , nome1 );

        int quantidade = 48;
        System.out.printf("Quantidade: %d itens\n", quantidade);

        double peso = 938.22;
        System.out.printf("Peso: %f \n", peso);
    }
}
