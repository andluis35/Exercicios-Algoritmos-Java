package exercicio083;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Anderson Luis
 */

public class Exercicio083 {

    public static void main(String[] args) {
        Random randomNumber = new Random();
        int[] arrayOfNumbers = new int[20];
        
        System.out.print("DESORDENADO: ");
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = randomNumber.nextInt(100);
            System.out.print(arrayOfNumbers[i] + " ");
        }
        
        Arrays.sort(arrayOfNumbers);
        
        System.out.print("\nORDENADO: ");
        for(int value : arrayOfNumbers) {
            System.out.print(value + " ");
        }
        
        System.out.println("");
    }
    
}
