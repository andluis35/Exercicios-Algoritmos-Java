package exercicio015;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio015 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int daysOfWork;
        final int HOURS_PER_DAY = 8;
        final float AMOUNT_PER_HOUR = 25.0f;
        
        System.out.print("Insira a quantidade de dias trabalhados: ");
        daysOfWork = keyboard.nextInt();
        
        System.out.printf("SALARIO: R$%.2f\n", calculateSalary(daysOfWork, HOURS_PER_DAY, AMOUNT_PER_HOUR));
    }
    
    public static float calculateSalary(int daysOfWork, int hoursPerDay, float amountPerHour) {
        return amountPerHour * hoursPerDay * daysOfWork;
    }
    
}
