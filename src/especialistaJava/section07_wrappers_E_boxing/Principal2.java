package especialistaJava.section07_wrappers_E_boxing;

public class Principal2 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.idade = null;
        System.out.printf("Idade: %d%n", cliente.idade);
    }
}
