package especialistaJava.section05_orientacaoObjectos.desafio5_7;

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.raca = "cane corso";
        dog.nome = "zeus";

        System.out.println("Raça: " + dog.raca);
        System.out.println("Nome: " + dog.nome);
    }
}
