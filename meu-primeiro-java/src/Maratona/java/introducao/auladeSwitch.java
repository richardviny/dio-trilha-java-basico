package Maratona.java.introducao;
// imprima o dia da semana, considerando 1 domingo ! 
public class auladeSwitch {
public static void main(String[] args) {
    byte  dia = 0 ;
    // char, int, byte, short , enum, String
    switch (dia) {
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda");
            break;  
        case 3:
            System.out.println("Terça");
            break;    
        case 4:
            System.out.println("Quarta");
            break;      
        case 5:
            System.out.println("Quinta");
            break; 
        case 6:
            System.out.println("Sexta");
            break;
        case 7:
            System.out.println("Sábado");
            break;
        default:
            System.out.println("Dia inválido");
            break;     
    }
        char sexo = 'F';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
            System.out.println("Mulher");
            default:
            System.out.println("Sexo inválido");
                break;
        }
}
}
