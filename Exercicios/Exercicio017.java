package exercicio017;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio017 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float speed;
        final int AMOUNT_PER_KM = 5;
        
        System.out.print("Digite a velocidade do veiculo: ");
        speed = keyboard.nextFloat();
        
        if(speed > 80) {
            System.out.printf("Você foi multado no valor de R$%.2f\n", calculateFine(speed, AMOUNT_PER_KM));
        }
        else {
            System.out.print("Você não foi multado.");
        }
    }
    
    public static float calculateFine(float speed, int amountPerKm) {
        return amountPerKm * (speed-80);
    }
    
}
