package logicaProgramacaoComJava.capitulo09_poo.exercicio01;

public class Loja {

    /*
        Crie um programa que contenha um método que verifique a necessidade de repor o estoque de determinado produto em uma loja qualquer.
        Considere que a quantidade mínima de um produto deva ser 10.

        Se o estoque for menor que isso, então ele retornará *true*, pois,
        será necessária a reposição do estoque, caso contrário, ele retornará false.

        Como parâmetro, esse método deverá receber um tipo que você irá criar e chamar de Produto, ou seja,
        você vai criar uma classe chamada Produto com os atributos necessários. Os atributos da classe serão nome e quantidadeEstoque.

        Feito isso, implemente o método main do programa.
        Nele você vai criar uma variável do tipo Produto e depois usar essa variável para invocar
        o método que valida a necessidade de reposição de estoque.

        No final, você vai exibir, no console, se é necessária a reposição ou não.
    */

    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

    String nome;

    Integer quantidadeEstoque;

}
