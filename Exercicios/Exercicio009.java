
package exercicio009;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio009 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double amount = 0.0f;
        final double DOLAR_QUOTE = 3.45;
        
        System.out.print("Digite quanto possui na carteira: R$");
        amount = keyboard.nextFloat();
        
        System.out.printf("Com R$%.2f você consegue comprar $%.2f\n", amount, calculateRealToDolar(amount, DOLAR_QUOTE));
    }
    
    public static double calculateRealToDolar(double a, double dolarQuote) {
        return a / dolarQuote;
    }
}
