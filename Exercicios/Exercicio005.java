package exercicio005;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio005 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float grade1, grade2, average;
        
        System.out.print("Nota 1: ");
        grade1 = keyboard.nextFloat();
        System.out.print("Nota 2: ");
        grade2 = keyboard.nextFloat();
        
        System.out.println("A média entre " + grade1 + " e " + grade2 + " é igual a " + calculateAverage(grade1, grade2));
    }
    
    public static float calculateAverage(float g1, float g2) {
        return (g1+g2)/2;
    }
    
}
