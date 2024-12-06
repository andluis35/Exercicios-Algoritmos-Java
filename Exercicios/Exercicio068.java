package exercicio068;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio068 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        byte currentGender;
        float currentWeight;
        float sumOfWomenWeights = 0;
        float biggestMenWeight = 0;
        final int MALE = 1;
        final int FEMALE = 2;
        int numberOfWomen = 0;
        int menAbove100kg = 0;
        
        for(int i = 1; i <= 8; i++) {
            System.out.println("--------------------------------------");
            System.out.println("Insira o sexo da " + i + "ª pessoa: ");
            System.out.print("[1] Masculino\n[2] Feminino\nR: ");
            currentGender = keyboard.nextByte();
            
            System.out.print("Insira o peso da " + i + "ª pessoa: ");
            currentWeight = keyboard.nextFloat();
            
            if(currentGender == MALE) {
                if(currentWeight > 100) {
                    menAbove100kg++;
                }
                biggestMenWeight = updateBiggestMenWeight(biggestMenWeight, currentWeight, i);
            }
            
            if(currentGender == FEMALE) {
                numberOfWomen++;
                sumOfWomenWeights += currentWeight;
            }
        }
        
        System.out.println("--------------------------------------");
        System.out.println("MULHERES CADASTRADAS: " + numberOfWomen);
        System.out.println("HOMENS ACIMA DE 100kg: " + menAbove100kg);
        System.out.println("MÉDIA DE PESO ENTRE AS MULHERES: " + (sumOfWomenWeights / numberOfWomen));
        System.out.println("MAIOR PESO ENTRE OS HOMENS: " + biggestMenWeight);
    }
    
    public static float updateBiggestMenWeight(float biggestWeight, float currentWeight, int i) {
        if(isFirstTime(i)) {
            biggestWeight = currentWeight;
        }
        else {
            if(currentWeight > biggestWeight) {
                biggestWeight = currentWeight;
            }
        }
        return biggestWeight;
    }
    
    public static boolean isFirstTime(int i) {
        return i == 1;
    }
    
}
