package especialistaJava.section02_fundamentosJava.tiposPrimitivos;

public class ConversaoLongParaInt {
    public static void main(String[] args) {
        long x = 10;

        //int y = x; // nao compila
        int y = (int) x;

        System.out.println(x);
        System.out.println(y);

        long a = 9300000035L;
        int b = (int) a;

        System.out.println(a);
        System.out.println(b);
    }
}
