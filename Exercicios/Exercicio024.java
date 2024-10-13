package exercicio024;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio024 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double distance;
        
        System.out.print("Digite a distancia que deseja percorrer (EM KM): ");
        distance = keyboard.nextDouble();
        
        System.out.printf("VALOR A SER PAGO: R$%.2f\n", calculateTicketPrice(distance));
    }
    
    public static double calculateTicketPrice(double distance) {
        if(distance <= 200) {
            return 0.5 * distance;
        }
        else {
            return 0.45 * distance;
        }
    }
    
}
