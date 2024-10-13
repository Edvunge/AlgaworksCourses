package especialistaJava.section03_estruturasControle_E_operadores;

public class OperadoresIgualdadeNegacao {
    public static void main(String[] args) {
       // boolean numerosIguais = 10 == 10;
       // boolean numerosIguais = (4 + 6) == (5 * 2);
        int numero1 = 10;
        int numero2 = 10;
        boolean numerosIguais = numero1 == numero2;

        boolean numerosDiferentes = !numerosIguais;


        System.out.printf("numeros iguais: %b%n", numerosIguais);
        System.out.printf("numeros diferentes: %b%n", numerosDiferentes);
    }
}
