package especialistaJava.section05_orientacaoObjectos.portaria;

public class Principal {

    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 25;

      //  Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO;

        if (novoVisitante.possuiAcessoRestritoPorIdade()) {
            System.out.println("Acesso nao permitido para menores de 18 anos");
        } else {
            System.out.println("Acesso Liberado");
        }
    }
}
