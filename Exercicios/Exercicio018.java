package exercicio018;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio018 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int birthYear;
        int age;
        
        System.out.print("Digite seu ano de nascimento: ");
        birthYear = keyboard.nextShort();
        age = calculateAge(birthYear);
        
        System.out.printf("IDADE: %d\n", age);
        
        if(age < 16) {
            System.out.print("Voce nao pode votar\n");
        }
        else {
            System.out.print("Voce pode votar\n");
        }
    }
    
    public static int calculateAge(int birthYear) {
        return 2024 - birthYear;
    }
    
}
