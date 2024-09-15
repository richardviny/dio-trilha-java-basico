package Maratona.java.introducao;
// while, do while, for 
public class estruturasDeRepeticao {
    public static void main(String[] args) {
        int count = 0;

        // Loop while
        while (count < 10) {
            System.out.println(++count);
        }

        // Loop do-while
        do {
            System.out.println("dentro do do-while");
        } while (count < 10);
    }
}