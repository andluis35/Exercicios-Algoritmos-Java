package exercicio033;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio033 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float houseValue, buyerSalary, monthlyAmount;
        int yearsToPay;
        final short MONTHS_PER_YEAR = 12;
        
        System.out.print("Valor da casa: R$");
        houseValue = keyboard.nextFloat();
        System.out.print("Salario do comprador: R$");
        buyerSalary = keyboard.nextFloat();
        System.out.print("Anos a pagar: ");
        yearsToPay = keyboard.nextInt();
        
        monthlyAmount = houseValue / (MONTHS_PER_YEAR * yearsToPay);
        
        printDivider();
        showIfLoanWasGranted(monthlyAmount, buyerSalary);   
    }
    
    public static void showIfLoanWasGranted(float monthlyAmount, float buyerSalary) {
        System.out.printf("MENSALIDADE: %.2f\n", monthlyAmount);
        if(monthlyAmount > (0.3*buyerSalary)) {
            System.out.println("EMPRESTIMO NEGADO!");
        }
        else {
            System.out.println("EMPRESTIMO CONCEDIDO!");
        }
    }
    
    public static void printDivider() {
        System.out.println("--------------------");
    }
    
}
