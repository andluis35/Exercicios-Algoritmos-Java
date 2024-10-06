package exercicio006;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */
public class Exercicio006 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        
        System.out.print("Digite um número: ");
        number = keyboard.nextInt();
        
        System.out.println("O antecessor de " + number + " é " + predecessor(number));
        System.out.println("O sucessor de " + number + " é " + successor(number));
    }
    
    public static int predecessor(int n) {
        return n-1;
    }
    
    public static int successor(int n) {
        return n+1;
    }
        
}
