package exercicio003;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */
public class Exercicio003 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String employeeName;
        String currentMonth;
        float salary = 0.0f;
        
        System.out.print("Nome do funcionário: ");
        employeeName = keyboard.nextLine();
        
        System.out.print("Salário: ");
        salary = keyboard.nextFloat();
        
        System.out.print("Mês atual: ");
        currentMonth = keyboard.next();
        
        System.out.printf("O(a) funcionário(a) %s tem um salário de R$%.2f no mês de %s.\n", employeeName, salary, currentMonth);
    }
    
}
