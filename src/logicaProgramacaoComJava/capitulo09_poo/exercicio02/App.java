package logicaProgramacaoComJava.capitulo09_poo.exercicio02;

public class App {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.nome = "Oppo Mobile";
        loja.quantidadeEstoque = 10;

        System.out.println("Necessário repor estoque do produto " + loja.nome + "? " + loja.eNecessarioReporEstoque());
    }

}
