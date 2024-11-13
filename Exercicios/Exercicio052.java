package exercicio052;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio052 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float ageAverage;
        final int TOTAL_AGES = 10;
        int age;
        int sumAges = 0; 
        int agesAbove18 = 0;
        int agesUnder5 = 0;
        int biggestAge = 0;
        int i = 1;
        
        while(i <= TOTAL_AGES) {
            System.out.print("Digite a " + i + "º idade: ");
            age = keyboard.nextInt();
            
            sumAges += age;
            biggestAge = defineBiggestAge(biggestAge, age);
            agesAbove18 = checkIfAgeIsGreaterThan18(age, agesAbove18);
            agesUnder5 = checkIfAgeIsLessThan5(age, agesUnder5);
            
            i++;
        }
        
        ageAverage = calculateAgeAverage(sumAges, TOTAL_AGES);
        
        System.out.println("------------------------------------------");
        System.out.println("MÉDIA DE IDADE: " + ageAverage);
        System.out.println("PESSOAS MAIORES DE 18: " + agesAbove18);
        System.out.println("PESSOAS MENORES DE 5: " + agesUnder5);
        System.out.println("MAIOR IDADE: " + biggestAge);
    }
    
    public static int defineBiggestAge(int biggestAge, int age) {  
        if(age > biggestAge || age == 0) {
            biggestAge = age;
        }
        
        return biggestAge;
    }
    
    public static int checkIfAgeIsGreaterThan18(int age, int agesAbove18) {
        if(isAgeGreaterThan18(age)) {
            return ++agesAbove18;
        }
        else {
            return agesAbove18;
        }
    }
    
    public static int checkIfAgeIsLessThan5(int age, int agesUnder5) {
        if(isAgeLessThan5(age)) {
            return ++agesUnder5;
        }
        else {
            return agesUnder5;
        }
    }
    
    public static boolean isAgeGreaterThan18(int age) {
        return age > 18;
    }
    
    public static boolean isAgeLessThan5(int age) {
        return age < 5;
    }
    
    public static float calculateAgeAverage(int sumAges, int totalAges) {
        return sumAges / totalAges;
    }
    
}
