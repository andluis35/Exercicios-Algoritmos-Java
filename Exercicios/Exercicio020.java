package exercicio020;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio020 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        
        System.out.print("Digite um número: ");
        number = keyboard.nextInt();
        
        if(number % 2 == 0) {
            System.out.print("Este numero é PAR\n");
        }
        else {
            System.out.print("Este numero é ÍMPAR\n");
        }
    }
    
}
