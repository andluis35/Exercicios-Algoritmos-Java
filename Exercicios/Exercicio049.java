package exercicio049;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio049 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int evenNumbers = 0;
        int oddNumbers = 0;
        int currentNumber;
        int i = 1;
        
        while(i <= 6) {
            System.out.print("Digite o " + i + "º número: ");
            currentNumber = keyboard.nextInt();
            
            if(isEvenNumber(currentNumber)) {
                evenNumbers++;
            }
            else {
                oddNumbers++;
            }
            
            i++;
        }
        
        System.out.println("-------------------------------");
        System.out.println("PARES DIGITADOS: " + evenNumbers);
        System.out.println("ÍMPARES DIGITADOS: " + oddNumbers);
    }
    
    public static boolean isEvenNumber(int number) {
        return (number % 2) == 0;
    }
    
}
