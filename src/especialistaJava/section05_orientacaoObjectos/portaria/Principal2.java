package especialistaJava.section05_orientacaoObjectos.portaria;

public class Principal2 {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante, 10);
    }
}
