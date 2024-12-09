package exercicio071;

/**
 * @author Anderson Luis
 */

public class Exercicio071 {

    public static void main(String[] args) {
        int[] array = new int[8];
        
        for(int i = 0; i < array.length; i++) {
            array[i] = 999;
        }
        
        printArray(array);
    }
    
    public static void printArray(int[] array) {
        for(int value : array) {
            System.out.print("[" + value + "] ");
        }
        System.out.println("");
    }
    
}
