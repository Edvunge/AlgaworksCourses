package especialistaJava.section05_orientacaoObjectos;

public class Principal {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2001;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.proprietario = new Pessoa();
        meuCarro.proprietario.nome = "Edvaldo";
        meuCarro.proprietario.cpf = "123.456.789-33";
        meuCarro.proprietario.anoNascimento = 1995;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2024;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";

        double ipva = meuCarro.calacularIpva();
        System.out.println(ipva);

        meuCarro.imprimirResumoDepreciacao();
    }
}
