package exercicio019;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio019 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        float grade1, grade2;
        float average;
        
        System.out.print("Digite seu nome: ");
        name = keyboard.nextLine();
        System.out.print("Nota 1: ");
        grade1 = keyboard.nextFloat();
        System.out.print("Nota 2: ");
        grade2 = keyboard.nextFloat();
        
        System.out.println("--------------------");
        average = calculateAverage(grade1, grade2);
        System.out.printf("MÉDIA: %.2f\n", average);
        
        if(average > 7) {
            System.out.printf("O aluno %s obteve bom aproveitamento\n", name);
        }
        else {
            System.out.printf("O aluno %s NÃO obteve bom aproveitamento\n", name);
        }
    }
    
    public static float calculateAverage(float grade1, float grade2) {
        return (grade1 + grade2) / 2;
    }
    
}
