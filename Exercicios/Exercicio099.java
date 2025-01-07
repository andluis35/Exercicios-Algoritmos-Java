package exercicio099;

/**
 * @author Anderson Luis
 */

public class Exercicio099 {

    public static void main(String[] args) {
        System.out.println(potencia(5,2));
    }
    
    public static int potencia(int base, int expoente) {
        int n = 1;
        for(int i = 1; i <= expoente; i++) {
            n *= base;
        }
        return n;
    }
    
}
