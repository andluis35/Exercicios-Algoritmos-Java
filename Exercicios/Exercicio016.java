package exercicio016;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio016 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int amountOfCigarettes;
        int yearsOfSmoking;
        int daysLostDueSmoking;
        int totalMinutesLostDueSmoking;
        int totalDaysSmoking;
        final int MINUTES_LOST_PER_CIGARETTE = 10;
        final int DAYS_PER_YEAR = 365;
        final int MINUTES_PER_DAY = 1440;
        
        System.out.print("Quantos cigarros você fuma por dia?\nR: ");
        amountOfCigarettes = keyboard.nextInt();
        System.out.print("Há quantos anos você fuma?\nR: ");
        yearsOfSmoking = keyboard.nextInt();
        
        totalDaysSmoking = yearsOfSmoking * DAYS_PER_YEAR;
        totalMinutesLostDueSmoking = amountOfCigarettes * totalDaysSmoking * MINUTES_LOST_PER_CIGARETTE;
        daysLostDueSmoking = totalMinutesLostDueSmoking / MINUTES_PER_DAY;
        
        System.out.println("Dias perdidos por fumar: " + daysLostDueSmoking);
    }
    
}
