package especialistaJava.section05_orientacaoObjectos;

public class Principal {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.anoFabricacao = 2001;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";

        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);

    }
}
