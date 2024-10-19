package especialistaJava.section05_orientacaoObjectos;

public class TesteInicializacao {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        System.out.println(meuCarro.anoFabricacao);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.fabricante);
    }
}
