package exercicio074;

/**
 * @author Anderson Luis
 */

public class Exercicio074 {

    public static void main(String[] args) {
        int[] array = new int[10];
        
        for(int i = array.length - 1; i >= 0; i--) {
            if(isIndexEven(i)) {
                array[i] = 5;
            }
            else {
                array[i] = 3;
            }
        }
        
        printArray(array);
    }
    
    public static boolean isIndexEven(int i) {
        return (i % 2) == 0;
    }
    
    public static void printArray(int[] array) {
        for(int value : array) {
            System.out.print("[" + value + "] ");
        }
        System.out.println("");
    }
    
}
