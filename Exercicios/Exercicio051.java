package exercicio051;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio051 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float price;
        float biggest = 0.0f;
        float lowest = 0.0f;
        boolean isFirstTime = true;
        int i = 1;
        
        while(i <= 8) {
            System.out.print("Digite o preço do " + i + "º produto: R$");
            price = keyboard.nextFloat();
            
            if(isFirstTime) {
                biggest = price;
                lowest = price;
                isFirstTime = false;
            }
            
            if(price > biggest) {
                biggest = price;
            }
            
            if(price < lowest) {
                lowest = price;
            }
            
            i++;
        }
        
        System.out.println("---------------------------");
        System.out.println("MAIOR VALOR: R$" + biggest);
        System.out.println("MENOR VALOR: R$" + lowest);
    }
    
}
