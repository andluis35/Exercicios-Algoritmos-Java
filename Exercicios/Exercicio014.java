package exercicio014;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio014 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double kmDriven;
        int daysOfUse;
        
        System.out.print("Digite quantos km foram rodados com o veículo: ");
        kmDriven = keyboard.nextFloat();
        System.out.print("Digite por quantos dias o veículo foi alugado: ");
        daysOfUse = keyboard.nextInt();
        
        System.out.printf("VALOR A PAGAR: R$%.2f\n", calculatePrice(daysOfUse, kmDriven));
    }
    
    public static double calculatePrice(int days, double km) {
        return (90*days) + (0.2*km);
    }
    
}
