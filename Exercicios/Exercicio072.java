package exercicio072;

/**
 * @author Anderson Luis
 */

public class Exercicio072 {

    public static void main(String[] args) {
        int[] array = new int[10];
        
        for(int i = 0; i < array.length; i++) {
            array[i] = 5 * (i+1);
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
