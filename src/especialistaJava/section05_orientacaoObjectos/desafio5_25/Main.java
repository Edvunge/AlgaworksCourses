package especialistaJava.section05_orientacaoObjectos.desafio5_25;

public class Main {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "edvaldo vunge";
        funcionario.quantidadeDeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 51.8;
        contratoTrabalho.valorHoraExtra = 60.5;

        double salarioDevido = folhaPagamento.calcularSalario(160, 10, contratoTrabalho);

        System.out.printf("Salario devido: R$ %.2f%n", salarioDevido);
    }
}
