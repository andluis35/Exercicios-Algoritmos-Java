package exercicio007;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio007 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float number;
        
        System.out.print("Digite um número: ");
        number = keyboard.nextFloat();
        
        System.out.println("O dobro de " + number + " é " + duplicate(number));
        System.out.println("A terça parte de " + number + " é " + divideByThree(number));
    }
    
    public static float duplicate(float n) {
        return 2*n;
    }
    
    public static float divideByThree(float n) {
        return n/3;
    }
    
}
