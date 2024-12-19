package especialistaJava.section07_wrappers_E_boxing.outros;

public class Principal2 {
    public static void main(String[] args) {
        Integer idade = null;

        // NullpointerException em todas as instruções abaixo
        System.out.println(idade + 10);
        System.out.println(idade == 100);
        System.out.println(idade.equals(100));
    }
}
