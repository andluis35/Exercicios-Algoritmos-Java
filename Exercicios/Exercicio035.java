package exercicio035;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio035 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float kmTraveled;
        int rentedDays;
        byte typeOfCar;
        
        System.out.println("--------------------------------");
        System.out.println("Qual o tipo de carro escolhido? ");
        System.out.println("[1] Popular");
        System.out.println("[2] Luxo");
        System.out.print("R: ");
        typeOfCar = keyboard.nextByte();
        
        System.out.println("--------------------------------");
        System.out.println("Quantos dias de aluguel?");
        System.out.print("R: ");
        rentedDays = keyboard.nextInt();
        
        System.out.println("--------------------------------");
        System.out.println("Quantos KM foram percorridos?");
        System.out.print("R: ");
        kmTraveled = keyboard.nextFloat();
        
        System.out.println("--------------------------------");        
        System.out.println("Valor a pagar: R$" + calculateRentPrice(typeOfCar, rentedDays, kmTraveled));
        System.out.println("--------------------------------");
    }
    
    public static double calculateRentPrice(byte typeOfCar, int rentedDays, float kmTraveled) {
        final float PRICE_POPULAR_CAR_PER_DAY = 90.0f;
        final float PRICE_LUXURY_CAR_PER_DAY = 150.0f;
        final byte POPULAR_CAR = 1;
        final byte LUXURY_CAR = 2;
        double amountToPay = 0.0f;
        
        if(typeOfCar == POPULAR_CAR) {
            amountToPay = PRICE_POPULAR_CAR_PER_DAY * rentedDays;
            if(kmTraveled <= 100.0) {
                amountToPay += 0.2 * kmTraveled;
            }
            else {
                amountToPay += 0.1 * kmTraveled;
            }
        }
        
        if(typeOfCar == LUXURY_CAR) {
            amountToPay = PRICE_LUXURY_CAR_PER_DAY * rentedDays;
            if(kmTraveled <= 200) {
                amountToPay += 0.3 * kmTraveled;
            }
            else {
                amountToPay += 0.25 * kmTraveled;
            }
        }

        return amountToPay;
    }
    
}
