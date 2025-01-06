package exercicio098;

/**
 * @author Anderson Luis
 */

public class Exercicio098 {

    public static void main(String[] args) {
        System.out.println(superSomador(15, 19));
    }
    
    public static int superSomador(int start, int end) {
        int sum = 0;
        
        for(int i = start; i <= end; i++) {
            sum += i;
        }
        
        return sum;
    }
    
}
