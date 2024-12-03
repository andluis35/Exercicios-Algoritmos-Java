package exercicio066;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio066 {

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        int number;
        
        System.out.print("Digite um valor: ");
        number = keyboard.nextInt();
        System.out.println("-----------------");
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }
    
}
