package exercicio012;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio012 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double price;
        
        System.out.print("Insira o preço do produto: R$");
        price = keyboard.nextDouble();
        
        System.out.printf("Com desconto de 5%%, o valor do produto passa a ser R$%.2f\n", calculateDiscount(price));
    }
    
    public static double calculateDiscount(double p) {
        return p - (p*0.05);
    }
}
