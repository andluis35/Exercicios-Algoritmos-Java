package exercicio062;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio062 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        byte currentAge;
        byte choice;
        int numberOfAgesEntered = 0;
        int sumOfAges = 0;
        int peopleAboveOrEqualTo21 = 0;
        int i = 1;
        
        do {
            System.out.println("-----------------------------------");
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            currentAge = keyboard.nextByte();
            
            numberOfAgesEntered++;
            sumOfAges += currentAge;
            
            if(currentAge >= 21) {
                peopleAboveOrEqualTo21++;
            } 
            
            System.out.println("-----------------------------------");
            System.out.print("Deseja continuar?\n[1] Sim\n[2] Não\nR: ");
            choice = keyboard.nextByte();
            
            i++;
            
        } while(choice == 1);
        
        System.out.println("-----------------------------------");
        System.out.println("IDADES DIGITADAS: " + numberOfAgesEntered);
        System.out.println("MÉDIA DAS IDADES: " + (sumOfAges / numberOfAgesEntered));
        System.out.println("PESSOAS COM IDADE MAIOR OU IGUAL A 21: " + peopleAboveOrEqualTo21);
    }
    
}
