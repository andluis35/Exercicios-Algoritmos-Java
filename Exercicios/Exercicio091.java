package exercicio091;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio091 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1;
        int n2;
        
        System.out.print("Digite o 1º número: ");
        n1 = keyboard.nextInt();
        System.out.print("Digite o 2º número: ");
        n2 = keyboard.nextInt();
        System.out.println("---------------------");
        
        maior(n1, n2);
    }
    
    public static void maior(int n1, int n2) {
        if(n1 > n2) {
            System.out.printf("O primeiro valor [%d] é maior que o segundo valor [%d].\n", n1, n2);
        }
        else if (n2 > n1) {
            System.out.printf("O segundo valor [%d] é maior que o primeiro valor [%d].\n", n2, n1);
        }
        else {
            System.out.println("Os valores são iguais.");
        }
    }
    
}
