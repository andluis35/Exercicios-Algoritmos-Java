package exercicio075;

/**
 * @author Anderson Luis
 */

public class Exercicio075 {

    public static void main(String[] args) {
        int[] array = new int[16];
        
        for(int i = 0; i < array.length; i++) {
            array[i] = fibo(i);
        }
        
        printArray(array);
        
    }
    
    public static int fibo(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }
    
    public static void printArray(int[] array) {
        for(int value : array) {
            System.out.print("[" + value + "] ");
        }
        System.out.println("");
    }
    
}
