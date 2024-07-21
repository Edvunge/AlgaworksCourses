package logicaProgramacaoComJava.capitulo08_metodos;

public class Recursividade {
    public static void main(String[] args) {
        String[] aluns = new String[] {"Alexandre","Joao","Maria"};

        iterarNomes(aluns);
    }

    static void iterarNomes(String[] alunos) {
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno: " + alunos[i]);
        }
    }
}
