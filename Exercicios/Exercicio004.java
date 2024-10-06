package exercicio004;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio004 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Digite um valor: ");
        num1 = keyboard.nextInt();
        System.out.print("Digite outro valor: ");
        num2 = keyboard.nextInt();
        
        System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + sum(num1, num2));
    }
    
    public static int sum(int n1, int n2) {
        return n1+n2;
    }
    
}
