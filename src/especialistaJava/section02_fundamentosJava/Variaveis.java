package especialistaJava.section02_fundamentosJava;

public class Variaveis {
    public static void main(String[] args) {
        int minhaIdade;
        minhaIdade = 23;

        int suaIdade;
        suaIdade = 20;

        double minhaAltura;
        minhaAltura = 1.90;

        float meuPeso;
        meuPeso = 104.90f;

        int totalIdades = minhaIdade + suaIdade;

        boolean statusAluno;
        statusAluno = true;

        System.out.println("minha idade:    "  + minhaIdade);
        System.out.println("sua idade:      "  + suaIdade);
        System.out.println("minha altura:   "  + minhaAltura);
        System.out.println("meu   peso:     "  + meuPeso);
        System.out.println("total idades:   "  + totalIdades);

        if (statusAluno) {
            System.out.println("aluno \"Aprovado\" ");
        } else {
            System.out.println("aluno \"Reprovado\" ");
        }
    }
}
