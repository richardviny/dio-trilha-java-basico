package Maratona.java;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {
 // Se a idade for menor que 15 quero que imprima a categoria juvenil, se for maior ou igual a 15 e menor que 18 imprima juvenil .

 // idade < 15 categoria infantil 
//  idade >= 15 && idade < 18 categoria juvenil
// idade >= 18 categoria adulto
    int idade = 20;
    if(idade<15){
        System.out.println("categoria infantil");
    } else if(idade>=15 && idade<18){
        System.out.println("Categoria Juvenil");
    }else if (idade>=18){
        System.out.println("categoria adulto");
    }
    }
}
