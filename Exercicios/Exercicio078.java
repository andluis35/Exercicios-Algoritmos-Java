package exercicio078;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio078 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int currentNumber;
        int[] arrayOfNumbers = new int[15];
        
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            currentNumber = keyboard.nextInt();
            arrayOfNumbers[i] = currentNumber;
        }
        
        System.out.println("--------------------------------------------");
        printArray(arrayOfNumbers);
    }
    
    public static void printArray(int[] arrayOfNumbers) {
        System.out.print("[ ");
        
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            if(isMultipleOfTen(arrayOfNumbers[i])) {
                System.out.print("[" + arrayOfNumbers[i] + "] | ");
            }
            else {
                if(isTheLastElement(i, arrayOfNumbers)) {
                    System.out.print(arrayOfNumbers[i] + " ");
                }
                else {
                    System.out.print(arrayOfNumbers[i] + " | ");
                }  
            }
        }
        
        System.out.println("]");
    }
    
    public static boolean isMultipleOfTen(int value) {
        return (value % 10) == 0;
    }
    
    public static boolean isTheLastElement(int i, int[] arrayOfNumbers) {
        return i == arrayOfNumbers.length - 1;
    }
    
}
