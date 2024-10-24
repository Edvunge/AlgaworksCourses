package especialistaJava.section05_orientacaoObjectos;

public class Paciente {

    double peso;
    double altura;

    IndiceMassaCorporal calcularIndiceMassaCorporal() {
        double imcCalculado = peso / (altura * altura);

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}
