package logicaProgramacaoComJava.capitulo09_poo.classeInstancia;

public class ClasseInstancia {
    public static void main(String[] args) {

        System.out.println("Quantidade Minima Estoque: " + Produto.QUANTIIDADE_MINIMA_ESTOQUE);

        Produto produto00 = new Produto();
        produto00.nome = "caneca";
        produto00.tamanho = 3.12;

        Produto produto01 = new Produto();
        produto01.nome = "caneca";
        produto01.tamanho = 11.19;

        Produto produto02 = new Produto();
        produto02.nome = "caneca";
        produto02.tamanho = 1.12;

        Produto.QUANTIIDADE_MINIMA_ESTOQUE = 11;
        System.out.println("Quantidade Minima Estoque: " + Produto.QUANTIIDADE_MINIMA_ESTOQUE);

        System.out.println("Produto 0: " + produto00.nome);
        System.out.println("Tamanho 0: " + produto00.tamanho);

        System.out.println("Produto 2: " + produto02.nome);
        System.out.println("Tamanho 2: " + produto02.nome);

        System.out.println("Produto 1: " + produto01.nome);
        System.out.println("Tamanho 1: " + produto01.tamanho);
    }
}
