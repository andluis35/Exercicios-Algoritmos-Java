package exercicio047;

/**
 * @author Anderson Luis
 */

public class Exercicio047 {

    public static void main(String[] args) {
        int i = 500;
        int sum = 0;
        
        while(i >= 0) {
            sum += i;
            i -= 50;
        }
        
        System.out.println("RESULTADO: " + sum);
    }
    
}
