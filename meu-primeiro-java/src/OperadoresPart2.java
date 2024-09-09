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
        
        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000; // adicionar mil 
        bonus -= 1000; // diminuir mil 
        bonus *= 2; // multiplicar por 2
        bonus /= 2; // dividir por 2
        bonus %= 3; // resto da divisao por 3
        System.out.println("bonus "+bonus);
        System.out.println(bonus);

        // 
        int contador = 0;
        contador += 1;
        contador -= 1;
        contador ++;
        contador --;
        ++ contador;
        int contador2 = 0;

        System.out.println(++contador2);

        

    }   
}

