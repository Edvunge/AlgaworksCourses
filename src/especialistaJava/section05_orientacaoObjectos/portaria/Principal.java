package especialistaJava.section05_orientacaoObjectos.portaria;

public class Principal {

    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 25;

      CadastroPortaria cadastroPortaria = new CadastroPortaria();
      cadastroPortaria.cadastrar(novoVisitante, 10);
    }
}
