package exercicio013;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio013 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double salary;
        
        System.out.print("Insira seu salario: R$");
        salary = keyboard.nextFloat();
        
        System.out.printf("Com aumento de 15%%, seu salario passa a ser R$%.2f\n", calculateRaise(salary));
    }
    
    public static double calculateRaise(double s) {
        return s + (s*0.15);
    }
    
}
