package Maratona;

public class AulaEstruturasCondicionais{
    public static void main(String[] args) {
        if (true){
            int idade = 19;
            boolean isAutorizadoComprarBebida = idade>=18;
            // !
        
            if (isAutorizadoComprarBebida)  { 
                System.out.println("Autorizado a comprar bebida alcóolica");
            }
            if (idade<=18) {
                System.out.println("Não autorizado a comprar bebida alcóolica");
                
            }            
        }
}
    }
// para não pode usar  a alteração do l13 (!isAutorizadoComprarBebida) porque o idade não consegue soltar um código booleano.

// Se a idade for menor que 15 quero que imprima a categoria juvenil, se for maior ou igual a 15 e menor que 18 imprima juvenil .
// idade < 15 categoria infantil 
//  idade >= 15 && idade < 18 categoria juvenil
// idade >= 18 categoria adulto
    int idade = 17;
    if(idade<15){
        System.out.println("categoria infantil");
    } else if(idade>=15 && idade<18){
        System.out.println("Categoria Juvenil");
    }else if (idade>=18){
        System.out.println("categoria adulto");
    }


