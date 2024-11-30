package exercicio063;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio063 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        byte choice;
        int currentNumber;
        int sumOfNumbers = 0;
        int smallestNumber = -1;
        int numbersEntered = 0;
        int amountOfEvenNumbers = 0;
        int i = 1;
        
        do {
            System.out.println("-----------------------------------");
            System.out.print("Digite o " + i + "º número: ");
            currentNumber = keyboard.nextInt();

            sumOfNumbers += currentNumber;
            numbersEntered++;
            
            smallestNumber = setSmallestNumber(currentNumber, smallestNumber, i);
            amountOfEvenNumbers = updateAmountOfEvenNumbers(currentNumber, amountOfEvenNumbers);            
            
            System.out.println("-----------------------------------");
            System.out.print("Deseja continuar?\n[1] Sim\n[2] Não\nR: ");
            choice = keyboard.nextByte();
            
            i++;
            
        } while(choice == 1);
        
        System.out.println("-----------------------------------");
        System.out.println("SOMATÓRIO DOS VALORES: " + sumOfNumbers);
        System.out.println("MENOR VALOR DIGITADO: " + smallestNumber);
        System.out.println("MÉDIA DOS VALORES DIGITADOS: " + (sumOfNumbers / numbersEntered));
        System.out.println("QUANTIDADE DE VALORES PARES: " + amountOfEvenNumbers);
    }
    
    public static int setSmallestNumber(int currentNumber, int smallestNumber, int i) {
        if(isFirstTime(i)) {
            smallestNumber = currentNumber;
        }
        else {
            if(currentNumber < smallestNumber) {
                smallestNumber = currentNumber;
            }
        }
        return smallestNumber;
    }
    
    public static int updateAmountOfEvenNumbers(int currentNumber, int amountOfEvenNumbers) {
        if(isEvenNumber(currentNumber)) {
            amountOfEvenNumbers++;
        }
        return amountOfEvenNumbers;
    }
    
    public static boolean isFirstTime(int i) {
        return i == 1;
    }
    
    public static boolean isEvenNumber(int currentNumber) {
        return (currentNumber % 2) == 0;
    }
    
}
