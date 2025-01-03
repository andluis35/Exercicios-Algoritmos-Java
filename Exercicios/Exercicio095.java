package exercicio095;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio095 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1;
        int n2;
        
        System.out.print("Digite o 1º número: ");
        n1 = keyboard.nextInt();
        System.out.print("Digite o 2º número: ");
        n2 = keyboard.nextInt();
        System.out.println("---------------------");
        
        System.out.println("RESULTADO: " + somador(n1, n2));
    }
    
    public static int somador(int n1, int n2) {
        return n1+n2;
    }
    
}
