package especialistaJava.section02_fundamentosJava;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int minhaIdade = 40;
        int suaIdade = 25;

        // adicao
        int totalIdades = minhaIdade + suaIdade + 100;
        System.out.println("soma das idades: " + totalIdades);

        // subtracao
        int diferencaIdades = minhaIdade + suaIdade;
        System.out.println("diferenca das idades: " + diferencaIdades);

        // multiplicacao
        int dobroDaIdade = 2 * suaIdade;
        System.out.println("dobro da sua idade: " + dobroDaIdade);

        // divisao
        int metadeIdade = suaIdade/2;
        System.out.println("metade da idade: " + metadeIdade);

        // modulo
        int restoDivisao = 7 % 2;
        System.out.println("Resto da divisao (modulo): " + restoDivisao);
    }
}
