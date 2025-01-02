package exercicio094;

/**
 * @author Anderson Luis
 */

public class Exercicio094 {

    public static void main(String[] args) {
        printFibonacci(9);
    }
    
    public static void printFibonacci(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " >> ");
        }
        System.out.println("FIM");
    }
    
    public static int fibonacci(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
}
