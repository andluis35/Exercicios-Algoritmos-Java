package exercicio088;

/**
 * @author Anderson Luis
 */

public class Exercicio088 {

    public static void main(String[] args) {
        gerador("Aprendendo Java", 4);
    }
    
    public static void gerador(String message, int numberOfTimes) {
        System.out.println("+-------=======-------+");
        
        for(int i = 1; i <= numberOfTimes; i++) {
            System.out.println("    " + message);
        }
        
        System.out.println("+-------=======-------+");
    }
    
}
