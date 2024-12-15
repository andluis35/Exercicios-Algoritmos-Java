package exercicio077;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio077 {

    public static void main(String[] args) {
        String[] arrayOfNames = new String[7];
        arrayOfNames = fillArray(arrayOfNames);   
        
        System.out.println("------------------------------"); 
        
        printReversedArray(arrayOfNames);
    }
    
    public static String[] fillArray(String[] arrayOfNames) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        
        for(int i = 0; i < 7; i++) {
            System.out.print("Digite o nome da " + (i+1) + "ª pessoa: ");
            name = keyboard.nextLine();
            arrayOfNames[i] = name;
        }
        
        return arrayOfNames;
    }
    
    public static void printReversedArray(String[] arrayOfNames) {
        for(int j = 6; j >= 0; j--) {
            System.out.println("Pessoa " + (j+1) + ": \t" + arrayOfNames[j]);
        }
    }
    
}
