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
