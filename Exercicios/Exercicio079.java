package exercicio079;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio079 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int currentNumber;
        int[] arrayOfNumbers = new int[10];
        
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            currentNumber = keyboard.nextInt();
            arrayOfNumbers[i] = currentNumber;
        }
        
        System.out.println("--------------------------------------------");
        printEvenNumbers(arrayOfNumbers);
    }
    
    public static void printEvenNumbers(int[] arrayOfNumbers) {        
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            if(isEven(arrayOfNumbers[i])) {
                System.out.println(arrayOfNumbers[i] + "\t=>\t" + "POSIÇÃO: " + i);
            }
        }
    }
    
    public static boolean isEven(int value) {
        return (value % 2) == 0;
    }
    
}
