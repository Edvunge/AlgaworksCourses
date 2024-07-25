package ignicaoJava.part02_ooAvancada.modelo.pagamento;

public interface DocumentoPagavel {

    double getValorTotal();
    boolean estaPago();
    void quitarPagamento();

}
