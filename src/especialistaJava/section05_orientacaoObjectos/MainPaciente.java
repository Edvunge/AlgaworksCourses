package especialistaJava.section05_orientacaoObjectos;

public class MainPaciente {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        // paciente.altura = 1.82;
        // paciente.peso = 75;

        double peso = 175;
        double altura = 1.82;

       // IndiceMassaCorporal imc = calculadoraImc.calcular(1.82, 175);

        //if (imc.resultado >= 30) {
          //  System.out.printf("Paciente com altura de %.2f e peso de %.2f " + "esta com obesidade", imc.altura, imc.peso);
        //}
        //System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
