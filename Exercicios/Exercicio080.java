package exercicio080;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio080 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] arrayOfNumbers = new int[30];
        int key;
        int timesKeyWasFound = 0;
        
        arrayOfNumbers = fillArray(arrayOfNumbers);
        
        System.out.print("Digite um número (chave): ");
        key = keyboard.nextInt();
        
        for(int value : arrayOfNumbers) {
            System.out.print(value + " ");
        }
        
        System.out.println("");
        
        for(int j = 0; j < arrayOfNumbers.length; j++) {
            if(key == arrayOfNumbers[j]) {
                System.out.print(j + " ");
                timesKeyWasFound++;
            }
        }
        System.out.println("");

    }
    
    public static int[] fillArray(int[] arrayOfNumbers) {
        Random randomNumber = new Random();
        
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = randomNumber.nextInt(15) + 1;
        }
        
        return arrayOfNumbers;
    }
    
}
