package exercicio082;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio082 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOfGrades = 10;
        int aboveAverageStudents;
        int biggestGradeIndex;
        float[] studentGrades = new float[numberOfGrades];
        float currentGrade;
        float sumOfGrades = 0.0f;
        float averageGrade;
        float biggestGrade;
        
        for(int i = 0; i < studentGrades.length; i++) {
            System.out.print("Digite a nota do " + (i+1) + "º aluno: ");
            currentGrade = keyboard.nextFloat();
            studentGrades[i] = currentGrade;
            
            sumOfGrades += currentGrade;
        }
        
        averageGrade = sumOfGrades / numberOfGrades;
        aboveAverageStudents = setAboveAverageStudents(studentGrades, averageGrade);
        biggestGrade = setBiggestGrade(studentGrades);
        biggestGradeIndex = setBiggestGradeIndex(studentGrades);
        
        System.out.println("----------------------------------------");
        System.out.printf("MÉDIA DA TURMA: %.2f\n", averageGrade);
        System.out.printf("ALUNOS ACIMA DA MÉDIA DA TURMA: %d\n", aboveAverageStudents);
        System.out.printf("MAIOR NOTA DIGITADA: %.2f\n", biggestGrade);
        System.out.printf("ÍNDICE DA MAIOR NOTA: %d\n", biggestGradeIndex);
        
    }
    
    public static int setAboveAverageStudents(float[] studentGrades, float averageGrade) {
        int aboveAverageStudents = 0;
        
        for(float grade : studentGrades) {
            if(grade > averageGrade) {
                aboveAverageStudents++;
            }
        }
        
        return aboveAverageStudents;
    }
    
    public static float setBiggestGrade(float[] studentGrades) {
        float biggestGrade = -1;
        
        for(int j = 0; j < studentGrades.length; j++) {
            if(studentGrades[j] > biggestGrade) {
                biggestGrade = studentGrades[j];
            }
        }
        
        return biggestGrade;
    }
    
    public static int setBiggestGradeIndex(float[] studentGrades) {
        float biggestGrade = -1;
        int biggestGradeIndex = -1;
        
        for(int j = 0; j < studentGrades.length; j++) {
            if(studentGrades[j] > biggestGrade) {
                biggestGrade = studentGrades[j];
                biggestGradeIndex = j;
            }
        }
        
        return biggestGradeIndex;
    }
    
}
