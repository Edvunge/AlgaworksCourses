package logicaProgramacaoComJava.capitulo09_poo.encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
        /*
        Cliente cliente = new Cliente();
        cliente.nome = "Edvaldo edv";
        cliente.telefone = "1234523232";

        System.out.println("Nome Cliente: " + cliente.nome );
        */

        Cliente cliente = new Cliente();
        cliente.setNome("Edvaldo vunge");
        cliente.setTelefone("23232332342");

        System.out.println("Nome Cliente: " + cliente.getNome());
        System.out.println("Primeiro Nome: " + cliente.getPrimeiroNome());
        System.out.println("Ultimo Nome: " + cliente.getUltimoNome());
    }
}
