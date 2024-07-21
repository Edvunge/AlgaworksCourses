package logicaProgramacaoComJava.capitulo09_poo.metodoInstancia;

public class MetodoInstancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "edvaldo";
        cliente.ultimoNome = "vunge";
        cliente.telefone = "000000";
        cliente.email = "edvaldo.vunge@email.com";

        System.out.println("Nome cliente: "+ cliente.obterNomeCompletoCliente() + ", DDD: " + cliente.obterDDD());
    }

}
