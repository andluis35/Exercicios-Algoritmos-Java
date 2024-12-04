package exercicio067;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio067 {

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        int number;
        
        System.out.print("Digite um valor: ");
        number = keyboard.nextInt();
        System.out.println("-----------------");
        System.out.print("CONTAGEM: ");
        
        for(int i = 0; i <= number; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("FIM!");
    }
    
}
