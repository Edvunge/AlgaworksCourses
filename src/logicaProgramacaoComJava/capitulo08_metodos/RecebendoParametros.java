package logicaProgramacaoComJava.capitulo08_metodos;

public class RecebendoParametros {
    public static void main(String[] args) {
        imprimir("***********************************");
        imprimirTraco();
        imprimir("ana");
        imprimirTraco();
        imprimir("************************************");
    }

    static void imprimirTraco() {
        System.out.println("--------------------------------------");
    }

    static void imprimir(String texto) {
        System.out.println(texto);
    }
}
