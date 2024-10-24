package exercicio036;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio036 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int hoursOfActivity, score;
        double gains;
        
        System.out.print("Horas de atividade realizada esse mês: ");
        hoursOfActivity = keyboard.nextInt();
        
        score = calculateScore(hoursOfActivity);
        gains = calculateGainsBasedOnScore(score);
        
        System.out.printf("VALOR GANHO: R$%.2f\n" , gains);
    }
    
    public static int calculateScore(int hoursOfActivity) {
        final int MAX_HOURS_PER_MONTH = 720;
        int score = 0;
        if(hoursOfActivity < 0 || hoursOfActivity > MAX_HOURS_PER_MONTH) {
            score = 0; 
        }
        else if(hoursOfActivity <= 10) {
            score = 2 * hoursOfActivity;
        }
        else if(hoursOfActivity > 10 && hoursOfActivity <= 20) {
            score = 5 * hoursOfActivity;
        }
        else if(hoursOfActivity > 20){
            score = 10 * hoursOfActivity;
        }
        
        return score;
    }
    
    public static double calculateGainsBasedOnScore(int score) {
        return 0.05 * score;
    }
    
}
