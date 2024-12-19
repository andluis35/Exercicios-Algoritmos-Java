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
        
        arrayOfNumbers = fillArray(arrayOfNumbers);
        
        System.out.print("Digite um número (chave): ");
        key = keyboard.nextInt();
        
        System.out.println("---------------------------------------------------");
        printArray(arrayOfNumbers);
        System.out.println("---------------------------------------------------");
        printIndexes(key, arrayOfNumbers);

    }
    
    public static int[] fillArray(int[] arrayOfNumbers) {
        Random randomNumber = new Random();
        
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = randomNumber.nextInt(15) + 1;
        }
        
        return arrayOfNumbers;
    }
    
    public static void printArray(int[] arrayOfNumbers) {
        System.out.print("[ ");
        
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            if(isTheLastElement(i, arrayOfNumbers)) {
                System.out.print(arrayOfNumbers[i] + " ");
            }
            else {
                System.out.print(arrayOfNumbers[i] + " | ");
            }  
            
        }
        
        System.out.println("]");
    }
    
    public static boolean isTheLastElement(int i, int[] arrayOfNumbers) {
        return i == arrayOfNumbers.length - 1;
    }
    
    public static void printIndexes(int key, int[] arrayOfNumbers) {
        int timesKeyWasFound = 0;
        
        System.out.print("O número " + key + " aparece na(s) posição(ões): ");
        for(int j = 0; j < arrayOfNumbers.length; j++) {
            if(key == arrayOfNumbers[j]) {
                System.out.print(j + " ");
                timesKeyWasFound++;
            }
        }
        System.out.println("(um total de " + timesKeyWasFound + " vez(es)!)");
    }
    
}
