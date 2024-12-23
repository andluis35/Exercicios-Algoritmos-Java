package exercicio084;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio084 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int TOTAL_PEOPLE = 9;
        int[] arrayOfAges = new int[TOTAL_PEOPLE];
        int currentAge;
        String[] arrayOfNames = new String[TOTAL_PEOPLE];
        String currentName;
        
        for(int i = 0; i < TOTAL_PEOPLE; i++) {
            System.out.print("Digite o nome da " + (i+1) + "ª pessoa: ");
            currentName = keyboard.nextLine();
            arrayOfNames[i] = currentName;
                
            System.out.print("Digite a idade da " + (i+1) + "ª pessoa: ");
            currentAge = keyboard.nextInt();
            arrayOfAges[i] = currentAge;
            System.out.println("--------------------------------------");
            
            keyboard.nextLine(); // Limpando o buffer do teclado
        }
        
        printUnderagePeople(arrayOfNames, arrayOfAges);   
    }
    
    public static void printUnderagePeople(String[] arrayOfNames, int[] arrayOfAges) {
        for(int j = 0; j < arrayOfNames.length; j++) {
            if(arrayOfAges[j] < 18) {
                System.out.println("NOME: " + arrayOfNames[j] + "\t\tIDADE: " + arrayOfAges[j]);
            }
        }
        
    }
    
}
