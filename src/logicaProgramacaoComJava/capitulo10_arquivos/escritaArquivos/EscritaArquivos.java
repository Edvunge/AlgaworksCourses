package logicaProgramacaoComJava.capitulo10_arquivos.escritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EscritaArquivos {
  public static void main(String[] args) throws IOException {
      ArrayList<String> linhas = new ArrayList<String>();
      linhas.add("edvaldo");
      linhas.add("kevin");
      linhas.add("joao");
      linhas.add("gabriel");
      linhas.add("gabriel miranda");
      linhas.add("charua");
      linhas.add("Bruno");   linhas.add("charua");
      linhas.add("Bruno");

      Path arquivo = Paths.get("C:\\Users\\HP\\Documents\\edvaldo/meu-arquivo.txt");
      Files.write(arquivo, linhas);

  }
}
