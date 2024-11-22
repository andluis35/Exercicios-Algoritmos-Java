package exercicio059;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio059 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        byte currentAge;
        byte biggestAge = 0;
        byte ageOfYoungestWoman = 0;
        byte gender;
        byte choice;
        final byte MALE = 1;
        final byte FEMALE = 2;
        int i = 1;
        int numberOfMen = 0;
        int sumOfMenAges = 0;
        boolean isFirstTime = true;
        boolean isFirstTimeFemale = true;
        float menAgeAverage;
        
        while(true) {
            System.out.println("==========================================");
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            currentAge = keyboard.nextByte();
            
            System.out.println("----------");
            
            System.out.print("Digite o gênero da " + i + "ª pessoa:\n[1] Masculino\n[2] Feminino\nR: ");
            gender = keyboard.nextByte();
            
            if(isFirstTime) {
                biggestAge = currentAge;
                isFirstTime = false;
            }
            else {
                if(currentAge > biggestAge) {
                    biggestAge = currentAge;
                }
            }
            
            if(gender == MALE) {
                numberOfMen++;
                sumOfMenAges += currentAge;
            }
            
            if(gender == FEMALE) {
                if(isFirstTimeFemale) {
                    ageOfYoungestWoman = currentAge;
                    isFirstTimeFemale = false;
                }
                else {
                    if(currentAge < ageOfYoungestWoman) {
                        ageOfYoungestWoman = currentAge;
                    }
                }
            }
            
            System.out.println("----------");
            
            System.out.print("Deseja continuar?\n[1] Sim\n[2] Não\nR: ");
            choice = keyboard.nextByte();
            
            if(choice != 1) {
                break;
            }

            i++;
        }
        
        menAgeAverage = sumOfMenAges / numberOfMen;
        
        System.out.println("--------------------------------------");
        System.out.println("MAIOR IDADE LIDA: " + biggestAge);
        System.out.println("HOMENS CADASTRADOS: " + numberOfMen);
        System.out.println("IDADE DA MULHER MAIS JOVEM: " + ageOfYoungestWoman);
        System.out.println("MÉDIA DE IDADE DOS HOMENS: " + menAgeAverage);
    }
    
}
