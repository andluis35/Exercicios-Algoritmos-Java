package exercicio027;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio027 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float grade1, grade2, average;
        String situation;
        
        System.out.print("Digite a primeira nota: ");
        grade1 = keyboard.nextFloat();
        System.out.print("Digite a segunda nota: ");
        grade2 = keyboard.nextFloat();
        
        average = calculateAverage(grade1, grade2);
        situation = defineSituation(average);
        
        System.out.printf("NOTA: %.2f\n", average);
        System.out.printf("SITUACAO: %s\n", situation);
    }
    
    public static float calculateAverage(float grade1, float grade2) {
        return (grade1 + grade2) / 2;
    }
    
    public static String defineSituation(float average) {
        String situation;
        
        if(average < 5) {
            situation = "REPROVADO";
        }
        else if(average >= 5 && average < 7) {
            situation = "RECUPERAÇÃO";
        }
        else {
            situation = "APROVADO";
        }
        
        return situation;
    }
    
}
