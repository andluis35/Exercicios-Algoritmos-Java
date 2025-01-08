package exercicio100;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio100 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float g1;
        float g2;
        float average;
        
        System.out.print("Digite a 1ª nota: ");
        g1 = keyboard.nextFloat();
        System.out.print("Digite a 2ª nota: ");
        g2 = keyboard.nextFloat();
        System.out.println("---------------------");
        
        average = media(g1, g2);
        
        System.out.println("MÉDIA DO ALUNO: " + average);
        System.out.println("SITUAÇÃO DO ALUNO: " + situacao(average));
    }
    
    public static float media(float firstGrade, float secondGrade) {
        return (firstGrade + secondGrade) / 2;
    }
    
    public static String situacao(float average) {
        if(average < 4.0) {
            return "Reprovado";
        }
        else if(average >= 4.0 && average < 7.0) {
            return "Recuperação";
        }
        else {
            return "Aprovado";
        }
    }
    
}
