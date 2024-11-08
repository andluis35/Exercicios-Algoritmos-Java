package exercicio048;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio048 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        int i = 1;
        int sum = 0;
        
        while(i <= 7) {
            System.out.print("Digite o " + i + "º número: ");
            number = keyboard.nextInt();
            
            sum += number;
            i++;
        }
        
        System.out.println("SOMA: " + sum);
    }
    
}
