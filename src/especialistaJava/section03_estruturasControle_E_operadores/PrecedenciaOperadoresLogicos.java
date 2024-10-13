package especialistaJava.section03_estruturasControle_E_operadores;

public class PrecedenciaOperadoresLogicos {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean resultado = (x == 13 && x == 15) || y == 20;
        System.out.println(resultado);
    }
}
