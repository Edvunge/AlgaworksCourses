package especialistaJava.section02_fundamentosJava;

public class PromocaoAritmetica1 {
    public static void main(String[] args) {
        int x = 10;
        long y = 5;
        // int z = (x * y); não compila
        int z = (int) (x * y);

        System.out.println(z);
    }
}
