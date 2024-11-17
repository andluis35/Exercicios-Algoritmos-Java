package exercicio056;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio056 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        int sum = 0;
        int i = 1;
        final int FLAG = 1111;
        
        while(true) {
            System.out.print("Insira o " + i + "º número (1111 = SAIR): ");
            number = keyboard.nextInt();
            
            if(number == FLAG) {
                break;
            }
            else {
                sum += number;
            }
            
            i++;
        }
        
        System.out.println("----------------------------------");
        System.out.println("SOMA DOS NÚMEROS DIGITADOS: " + sum);
    }
    
}
