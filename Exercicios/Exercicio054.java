package exercicio054;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio054 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float currentWeight;
        float currentHeight;
        float sumHeights = 0.0f;
        float heightAverage;
        final int NUMBER_OF_PEOPLE = 7;
        int peopleOver90Kg = 0;
        int peopleUnder50KgAndUnder160m = 0;
        int peopleOver190mAndOver100Kg = 0;
        int i = 1;
        
        while(i <= NUMBER_OF_PEOPLE) {
            System.out.println("-------------------------------------");
            System.out.print("Digite o peso da " + i + "º pessoa: ");
            currentWeight = keyboard.nextFloat();
            System.out.print("Digite a altura da " + i + "º pessoa: ");
            currentHeight = keyboard.nextFloat();
            
            sumHeights += currentHeight;
            
            if(currentWeight > 90.0) {
                peopleOver90Kg++;
            }
            
            if(currentWeight < 50.0 && currentHeight < 1.60) {
                peopleUnder50KgAndUnder160m++;
            }
            
            if(currentHeight > 1.90 && currentWeight > 100.0) {
                peopleOver190mAndOver100Kg++;
            }
            
            i++;
        }
        
        heightAverage = sumHeights / NUMBER_OF_PEOPLE;
        
        System.out.println("-------------------------------------");
        System.out.printf("MÉDIA DE ALTURA DO GRUPO: %.2f\n" , heightAverage);
        System.out.println("PESSOAS ACIMA DE 90kg: " + peopleOver90Kg);
        System.out.println("PESSOAS ABAIXO DE 50kg E ABAIXO DE 1.60m: " + peopleUnder50KgAndUnder160m);
        System.out.println("PESSOAS ACIMA DE 1.90m E ACIMA DE 100kg: " + peopleOver190mAndOver100Kg);
    }
    
}
