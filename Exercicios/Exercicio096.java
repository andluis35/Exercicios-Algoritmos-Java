package exercicio096;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio096 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float g1;
        float g2;
        
        System.out.print("Digite a 1ª nota: ");
        g1 = keyboard.nextFloat();
        System.out.print("Digite a 2ª nota: ");
        g2 = keyboard.nextFloat();
        System.out.println("---------------------");
        
        System.out.println("MÉDIA DO ALUNO: " + media(g1, g2));
    }
    
    public static float media(float firstGrade, float secondGrade) {
        return (firstGrade + secondGrade) / 2;
    }
    
}
