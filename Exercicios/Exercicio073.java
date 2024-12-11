package exercicio073;

/**
 * @author Anderson Luis
 */

public class Exercicio073 {

    public static void main(String[] args) {
        int[] array = new int[10];
        int j = 0;
        
        for(int i = array.length - 1; i >= 0; i--) {
            array[j] = i;
            j++;
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
