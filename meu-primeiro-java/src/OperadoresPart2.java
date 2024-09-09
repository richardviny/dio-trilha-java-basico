public class OperadoresPart2 {
    public static void main(String[] args) {
       int resto = 21 % 7;
       System.out.println(resto);

       // menorque < > maiorque  != sempre vai dar o booleano
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);

        // && (AND) || (OR) ! 
        int idade = 25;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorqueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorqueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorqueTrinta "+isDentroDaLeiMaiorqueTrinta);
        System.out.println("isDentroDaLeiMenorqueTrinta " + isDentroDaLeiMenorqueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCompravel "+isPlaystationCompravel);
    }
}

