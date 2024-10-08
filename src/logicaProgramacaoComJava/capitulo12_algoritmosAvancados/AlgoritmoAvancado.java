package logicaProgramacaoComJava.capitulo12_algoritmosAvancados;

public class AlgoritmoAvancado {
    public static void main(String[] args) {
        ListaAlunos listaAlunos = new ListaAlunos();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "andre";
        listaAlunos.adicionar(aluno1);


        Aluno aluno2 = new Aluno();
        aluno2.nome = "andreia";
        listaAlunos.adicionar(aluno2);


        Aluno aluno3 = new Aluno();
        aluno3.nome = "alexandre";
        listaAlunos.adicionar(aluno3);


        Aluno aluno4 = new Aluno();
        aluno4.nome = "maria";
        listaAlunos.adicionar(aluno4);


        Aluno aluno5 = new Aluno();
        aluno5.nome = "joao";
        listaAlunos.adicionar(aluno5);


        Aluno aluno6 = new Aluno();
        aluno6.nome = "noe";
        listaAlunos.adicionar(aluno6);


        Aluno aluno7 = new Aluno();
        aluno7.nome = "ana";
        listaAlunos.adicionar(aluno7);


        Aluno aluno8 = new Aluno();
        aluno8.nome = "ana maria";
        listaAlunos.adicionar(aluno8);

        iterar(listaAlunos);

        listaAlunos.remover(aluno3);

        iterar(listaAlunos);

        listaAlunos.ordenar();

        iterar(listaAlunos);
    }

    static void iterar(ListaAlunos listaAlunos) {
        for (int i = 0; i < listaAlunos.tamanho(); i++) {
            Aluno a = listaAlunos.obter(i);
            if (a != null) {
                System.out.println("Aluno: " + a.nome);
            } else {
                System.out.println("Aluno sem nome");
            }
        }
        System.out.println("---------------");
    }
}
