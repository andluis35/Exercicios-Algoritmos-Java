package exercicio076;

import java.util.Random;

/**
 * @author Anderson Luis
 */

public class Exercicio076 {

    public static void main(String[] args) {
        Random number = new Random();
        int[] array = new int[7];
        
        for(int i = 0; i < array.length; i++) {
            array[i] = number.nextInt(100);
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
