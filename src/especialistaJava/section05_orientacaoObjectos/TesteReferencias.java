package especialistaJava.section05_orientacaoObjectos;

public class TesteReferencias {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Joao";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "HR-V";
        meuCarro.proprietario = pessoa1;
    }
}
