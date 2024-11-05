package exercicio046;

/**
 * @author Anderson Luis
 */

public class Exercicio046 {

    public static void main(String[] args) {
        int i = 6;
        int sum = 0;
        
        while(i <= 100) {
            sum += i;
            i += 2;
        }
        
        System.out.println("RESULTADO: " + sum);
    }
    
}
