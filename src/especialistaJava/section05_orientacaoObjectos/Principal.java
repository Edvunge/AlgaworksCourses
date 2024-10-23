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

        System.out.println("Meu Carro");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Cor: %s%n", meuCarro.cor);
        System.out.printf("Fabricante: %s%n", meuCarro.fabricante);
        System.out.printf("Nome do Proprietario: %s%n", meuCarro.proprietario.nome);
        System.out.printf("CPF do Proprietario: %s%n", meuCarro.proprietario.cpf);
        System.out.printf("AnoNascimento do Proprietario: %s%n", meuCarro.proprietario.anoNascimento);

        System.out.println();

        System.out.println("Seu Carro");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Cor: %s%n", seuCarro.cor);
        System.out.printf("Fabricante: %s%n", seuCarro.fabricante);

        System.out.println();
        System.out.println("- Metodos - ");
        meuCarro.calcularValorRevenda();
        seuCarro.calcularValorRevenda();
    }
}
