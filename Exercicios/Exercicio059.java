package exercicio059;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio059 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final byte MALE = 1;
        final byte FEMALE = 2;
        byte currentAge;
        byte biggestAge = 0;
        byte ageOfYoungestWoman = 0;
        byte gender;
        byte choice;
        int i = 1;
        int numberOfMen = 0;
        int numberOfWomen = 0;
        int sumOfMenAges = 0;
        
        while(true) {
            System.out.println("==========================================");
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            currentAge = keyboard.nextByte();
            
            System.out.println("----------");
            
            System.out.print("Digite o gênero da " + i + "ª pessoa:\n[1] Masculino\n[2] Feminino\nR: ");
            gender = keyboard.nextByte();
            
            biggestAge = setBiggestAge(currentAge, biggestAge, i);
            
            if(gender == MALE) {
                numberOfMen++;
                sumOfMenAges += currentAge;
            }
            
            if(gender == FEMALE) {
                ageOfYoungestWoman = setMinorAge(currentAge, ageOfYoungestWoman, numberOfWomen);
                numberOfWomen++;
            }
            
            System.out.println("----------");
            
            System.out.print("Deseja continuar?\n[1] Sim\n[2] Não\nR: ");
            choice = keyboard.nextByte();
            
            if(choice != 1) {
                break;
            }

            i++;
        }
        
        System.out.println("--------------------------------------");
        System.out.println("MAIOR IDADE LIDA: " + biggestAge);
        System.out.println("HOMENS CADASTRADOS: " + numberOfMen);
        System.out.println("IDADE DA MULHER MAIS JOVEM: " + ageOfYoungestWoman);
        System.out.println("MÉDIA DE IDADE DOS HOMENS: " + (sumOfMenAges / numberOfMen));
    }
    
    public static byte setBiggestAge(byte currentAge, byte biggestAge, int i) {
        if(isFirstTime(i)) {
            biggestAge = currentAge;
        }
        else {
            if(currentAge > biggestAge) {
                biggestAge = currentAge;
            }
        }
        return biggestAge;
    }
    
    public static byte setMinorAge(byte currentAge, byte ageOfYoungestWoman, int numberOfWomen) {
        if(isHerTheFirstWoman(numberOfWomen)) {
            ageOfYoungestWoman = currentAge;
        }
        else {
            if(currentAge < ageOfYoungestWoman) {
                ageOfYoungestWoman = currentAge;
            }
        }
        return ageOfYoungestWoman;
    }
    
    public static boolean isFirstTime(int i) {
        return i == 1;
    }
    
    public static boolean isHerTheFirstWoman(int numberOfWomen) {
        return numberOfWomen == 0;
    }
    
}
