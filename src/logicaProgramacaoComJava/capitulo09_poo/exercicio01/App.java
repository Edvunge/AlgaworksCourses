package logicaProgramacaoComJava.capitulo09_poo.exercicio01;

public class App {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.nome = "Oppo Mobile";
        loja.quantidadeEstoque = 10;

        System.out.println("Necessário repor estoque do produto " + loja.nome + "? " + eNecessarioReporEstoque(loja));
    }

    static Boolean eNecessarioReporEstoque(Loja produto) {
        if (produto.quantidadeEstoque < Loja.QUANTIDADE_MINIMA_ESTOQUE) {
            return true;
        }

        return false;
    }
}
