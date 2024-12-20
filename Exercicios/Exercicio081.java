package exercicio081;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio081 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] arrayOfAges = new int[8];
        int sumOfAges = 0;
        int numberOfAgesEntered = arrayOfAges.length;
        int currentAge;
        
        for(int i = 0; i < arrayOfAges.length; i++) {
            System.out.print("Digite a idade da " + (i+1) + "ª pessoa: ");
            currentAge = keyboard.nextInt();
            arrayOfAges[i] = currentAge;
            
            sumOfAges += currentAge;
        }
        
        System.out.println("-------------------------------------------");
        System.out.println("MÉDIA DE IDADES: " + (sumOfAges / numberOfAgesEntered));
        System.out.println("POSIÇÕES COM IDADES MAIORES QUE 25: " + setAgesAbove25(arrayOfAges));
        System.out.println("MAIOR IDADE DIGITADA: " + setBiggestAge(arrayOfAges));
        System.out.println("ÍNDICE DA MAIOR IDADE DIGITADA: " + setIndexOfBiggestAge(arrayOfAges));
    }
    
    public static String setAgesAbove25(int[] arrayOfAges) {
        String agesAbove25 = "";
        
        for(int j = 0; j < arrayOfAges.length; j++) {
            if(arrayOfAges[j] > 25) {
                agesAbove25 += j + " ";
            }
        }
        return agesAbove25;
    }
    
    public static int setBiggestAge(int[] arrayOfAges) {
        int biggestAge = arrayOfAges[0];
        
        for(int k = 0; k < arrayOfAges.length; k++) {
            if(arrayOfAges[k] > biggestAge) {
                biggestAge = arrayOfAges[k];
            }
        }
        return biggestAge;
    }
    
    public static int setIndexOfBiggestAge(int[] arrayOfAges) {
        int biggestAge = arrayOfAges[0];
        int biggestAgeIndex = 0;
        
        for(int k = 0; k < arrayOfAges.length; k++) {
            if(arrayOfAges[k] > biggestAge) {
                biggestAge = arrayOfAges[k];
                biggestAgeIndex = k;
            }
        }
        return biggestAgeIndex;
    }
    
}
