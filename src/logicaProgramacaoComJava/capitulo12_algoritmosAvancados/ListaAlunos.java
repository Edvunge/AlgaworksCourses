package logicaProgramacaoComJava.capitulo12_algoritmosAvancados;

public class ListaAlunos {
    static final int QUANTIDADE_LISTA = 2;
    Aluno[] lista = new Aluno[QUANTIDADE_LISTA];

    int tamanhoLista = 0;

    Aluno obter(int indice) {
        return lista[indice];
    }

    int tamanho() {
        return tamanhoLista;
    }

    void adicionar(Aluno aluno) {
        if (lista.length == tamanhoLista) {
            Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];

            for (int i = 0; i < lista.length; i++) {
                novaLista[i] = lista[i];
            }

            lista = novaLista;
        }
        lista[tamanhoLista] = aluno;

        tamanhoLista++;
    }

    void remover(Aluno aluno) {
        for(int i = 0; i < tamanhoLista; i++) {
            Aluno a = lista[i];

            if ( a != null && a.equals(aluno)) {
                remover(i);
                break;
            } else if (a == null && aluno == null) {
                remover(i);
                break;
            }
        }
    }

    void remover(int indice) {
        int indiceInicial = indice + 1;

        for (int i = indiceInicial; i < tamanhoLista; i++) {
            lista[indiceInicial - 1] = lista[indiceInicial];
        }

        tamanhoLista--;
        lista[tamanhoLista] = null;
    }

    void ordenar() {
        for (int i = 0; i < tamanhoLista; i++) {

            Aluno alunoPosicaoBase = lista[i];
            int indicePosicaoBase = 1;

            while (indicePosicaoBase > 0) {
                int indicePosicaoAnterior = indicePosicaoBase - 1;
                Aluno alunoPosicaoAnterior = lista[indicePosicaoAnterior];

                Boolean alunoPosicaoAnteriorVemDepoisDe = alunoPosicaoAnterior == null
                        || alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase);

                if (alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase)) {
                    lista[indicePosicaoBase] = lista[indicePosicaoAnterior];

                    indicePosicaoBase--;
                } else {
                    break;
                }
            }
            lista[indicePosicaoBase] = alunoPosicaoBase;
        }
    }

}
