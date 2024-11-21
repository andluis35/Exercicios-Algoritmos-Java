package exercicio058;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio058 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i = 1;
        int numberOfStudents = 0;
        float sumOfAges = 0;
        float ageAverage;
        short age;
        final short FLAG = 999;
        
        while(true) {
            System.out.print("Digite a idade do " + i + "º aluno (999 = SAIR): ");
            age = keyboard.nextShort();
            
            if(age == FLAG) {
                break;
            }
            else {
                numberOfStudents++;
                sumOfAges += age;
            }
            
            i++;
        }
        
        ageAverage = sumOfAges / numberOfStudents;
        
        System.out.println("------------------------------------");
        System.out.println("ALUNOS NA TURMA: " + numberOfStudents);
        System.out.println("MÉDIA DE IDADE: " + ageAverage);
    }
    
}
