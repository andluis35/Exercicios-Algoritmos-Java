package exercicio069;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio069 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a1;
        int r;
        
        System.out.print("Digite o primeiro termo da P.A: ");
        a1 = keyboard.nextInt();
        
        System.out.print("Digite a razão da P.A: ");
        r = keyboard.nextInt();
        
        System.out.println("---------------------------------");
        System.out.println("TERMOS DA P.A: " + termsOfAP(a1, r, 10));
        System.out.println("SOMA DOS TERMOS DA P.A: " + sumOfAP(a1, r, 10));
    }
    
    public static String termsOfAP(int a1, int r, int n) {
        String an = "";
        int term;
        
        for(int i = 1; i <= 10; i++) {
            term = a1 + (i-1)*r;
            an += term + " ";
        }
        
        return an;
    }
    
    public static int sumOfAP(int a1, int r, int n) {
        int sum = 0;
        int term;
        
        for(int i = 1; i <= 10; i++) {
            term = a1 + (i-1)*r;
            sum += term;
        }
        
        return sum;
    }
    
}
