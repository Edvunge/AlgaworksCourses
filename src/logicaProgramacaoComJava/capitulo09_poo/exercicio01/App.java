package logicaProgramacaoComJava.capitulo09_poo.exercicio01;

public class App {
    public static void main(String[] args) {
        AlgaworksBlack.logicaProgramacaoComJava.capitulo09_poo.exercicio01.Loja loja = new AlgaworksBlack.logicaProgramacaoComJava.capitulo09_poo.exercicio01.Loja();
        loja.nome = "Oppo Mobile";
        loja.quantidadeEstoque = 10;

        System.out.println("Necessário repor estoque do produto " + loja.nome + "? " + eNecessarioReporEstoque(loja));
    }

    static Boolean eNecessarioReporEstoque(AlgaworksBlack.logicaProgramacaoComJava.capitulo09_poo.exercicio01.Loja produto) {
        if (produto.quantidadeEstoque < Loja.QUANTIDADE_MINIMA_ESTOQUE) {
            return true;
        }

        return false;
    }
}
