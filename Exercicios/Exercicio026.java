package exercicio026;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio026 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1, n2;
        
        System.out.print("Digite o primeiro numero: ");
        n1 = keyboard.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2 = keyboard.nextInt();
        
        if(n1 > n2) {
            System.out.printf("%d > %d\n", n1, n2);
        }
        else {
            if(n1 < n2) {
                System.out.printf("%d > %d\n", n2, n1);
            }
            else {
                System.out.printf("%d = %d\n", n1, n2);
            }
        }
    }
    
}
