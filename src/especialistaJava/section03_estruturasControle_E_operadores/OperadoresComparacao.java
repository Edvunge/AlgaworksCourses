package especialistaJava.section03_estruturasControle_E_operadores;

public class OperadoresComparacao {
    public static void main(String[] args) {
        int pesoProdutos = 9000;
        int limitePesoCaminhao = 1000;

        boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
        System.out.printf("Carga Excedida: %b%n",cargaExcedida);

        boolean cargaLiberada = pesoProdutos < limitePesoCaminhao;
        System.out.printf("Carga Liberada: %b%n",cargaLiberada);

    }
}
