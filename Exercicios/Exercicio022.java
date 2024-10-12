package exercicio022;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio022 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int birthYear;
        int age;
        int ageGap;
        final int LEGAL_AGE = 18;
        
        System.out.print("Insira seu ano de nascimento: ");
        birthYear = keyboard.nextShort();
        age = calculateAge(birthYear);
        ageGap = calculateAgeGap(age, LEGAL_AGE);
        
        if(age < LEGAL_AGE) {
            if(ageGap == 1) {
                System.out.printf("Falta %d ano para voce se alistar.\n", ageGap);
            }
            else {
                System.out.printf("Faltam %d anos para voce se alistar.\n", ageGap);
            }
        }
        else {
            if(ageGap == -1) {
                System.out.printf("Ja se passou %d ano desde seu alistamento.\n", Math.abs(ageGap));
            }
            else {
                System.out.printf("Ja se passaram %d anos desde seu alistamento.\n", Math.abs(ageGap));
            }  
        }
    }
    
    public static int calculateAge(int birthYear) {
        return 2024 - birthYear;
    }
    
    public static int calculateAgeGap(int age, int legalAge) {
        return legalAge - age;
    }
    
}
