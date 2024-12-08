package exercicio070;

/**
 * @author Anderson Luis
 */

public class Exercicio070 {

    public static void main(String[] args) {
        fibo(10);
    }
    
    public static void fibo(int n) {
        int a1 = 1;
        int a2 = 1;
        int a3;
        
        System.out.print(a1 + " " + a2 + " ");
        
        for(int i = 1; i <= n; i++) {
            a3 = a1+a2;
            a1 = a2;
            a2 = a3; 
            
            System.out.print(a3 + " ");
        }
    }
    
}
