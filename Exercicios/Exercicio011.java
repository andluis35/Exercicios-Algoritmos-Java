package exercicio011;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio011 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float a, b, c, delta;
        
        System.out.print("Insira o valor do coeficiente A: ");
        a = keyboard.nextFloat();
        System.out.print("Insira o valor do coeficiente B: ");
        b = keyboard.nextFloat();
        System.out.print("Insira o valor do coeficiente C: ");
        c = keyboard.nextFloat();
        
        delta = calculateDelta(a,b,c);
        
        System.out.printf("DELTA: %.2f\n", delta);
    }
    
    public static float calculateDelta(float a, float b, float c) {
        return (b*b) - (4*a*c);
    }
    
}
