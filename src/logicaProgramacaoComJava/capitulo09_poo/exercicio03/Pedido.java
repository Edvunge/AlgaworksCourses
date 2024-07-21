package logicaProgramacaoComJava.capitulo09_poo.exercicio03;

public class Pedido {

    double  codigo;
    double  subtotal;
    double  desconto;


    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void getTotal() {
 
    }

    public void setTotal(double total) {
        total = subtotal - desconto;
    }
}
