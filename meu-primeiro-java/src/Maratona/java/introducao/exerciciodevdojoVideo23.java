package Maratona.java.introducao;
 // Exercicio: Quanto eu tenho que pagar de imposto na Holanda em 2020 baseado no salário anual.
 //£ 0 £ 34,712  9,70% Salário 7000,00 
 //£ 34,713 £ 68,507  19,00%
 //£ 44,685 £ 68,507  37,10%
public class exerciciodevdojoVideo23 {
    public static void main(String[] args) {
        double salarioAnual = 2500;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 19.0 / 100;
        double terceiraFaixa = 37.10 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            salarioAnual = salarioAnual * primeiraFaixa;
        }  else if (salarioAnual >= 34713  && salarioAnual <= 68507) {
            salarioAnual = salarioAnual * segundaFaixa;
        } else {
            salarioAnual = salarioAnual * terceiraFaixa;
        }
        System.out.println(salarioAnual);
    }
}
