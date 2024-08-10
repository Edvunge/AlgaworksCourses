package especialistaJava.section02_fundamentosJava;

public class OperadorIncremento {
    public static void main(String[] args) {
        int totalDownloads = 10;

        // totalDownloads = totalDownloads + 1;
        // totalDownloads += 1;

        // totalDownloads++;

        int novoTotalDownloads = totalDownloads++;

        System.out.println("Total de downloads: " + totalDownloads);
        System.out.println("Novo Total de Downloads: " + novoTotalDownloads);
    }
}
