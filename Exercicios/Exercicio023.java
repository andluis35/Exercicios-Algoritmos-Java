package exercicio023;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio023 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        short gender;
        double purchaseValue;
        double amountToPay;
        
        System.out.print("Digite seu nome: ");
        name = keyboard.nextLine();
        System.out.println("-------------------");
        
        System.out.println("[1] Homem");
        System.out.println("[2] Mulher");
        System.out.println("[3] Outros");
        System.out.print("Digite como se identifica: ");
        gender = keyboard.nextShort();
        System.out.println("-------------------");
        
        System.out.print("Digite o valor das suas compras: R$");
        purchaseValue = keyboard.nextDouble();
        System.out.println("-------------------");
        
        amountToPay = calculateDiscountBasedOnGender(gender, purchaseValue);
        System.out.printf("Valor a ser pago por %s: R$%.2f\n", name, amountToPay);
    }
    
    public static double calculateDiscountBasedOnGender(short gender, double purchaseValue) {
        double amountToPay;
        switch (gender) {
            case 1:
                //Homem
                amountToPay = purchaseValue - (0.05*purchaseValue);
                break;
            case 2:
                //Mulher
                amountToPay = purchaseValue - (0.13*purchaseValue);
                break;
            default:
                //Outros
                amountToPay = purchaseValue - (0.15*purchaseValue);
                break;
        }
        return amountToPay;
    }
    
}
