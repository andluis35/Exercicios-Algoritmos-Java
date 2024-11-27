package exercicio060;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio060 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String currentName;
        String oldestPerson = "";
        String youngestWoman = "";
        final byte MALE = 1;
        final byte FEMALE = 2;
        byte currentAge;
        byte biggestAge = 0;
        byte ageOfYoungestWoman = 0;
        byte gender;
        byte choice;
        int sumOfAges = 0;
        int numberOfWomen = 0;
        int numberOfPeople = 0;
        int menAbove30 = 0;
        int womenUnder18 = 0;
        int i = 1;
        
        while(true) {
            System.out.println("==========================================");
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            currentName = keyboard.nextLine();
            
            System.out.println("----------");
            
            System.out.print("Digite a idade de " + currentName + ": ");
            currentAge = keyboard.nextByte();
            
            System.out.println("----------");
            
            System.out.print("Digite o gênero de " + currentName + ":\n[1] Masculino\n[2] Feminino\nR: ");
            gender = keyboard.nextByte();
            
            if(isFirstTime(i)) {
                biggestAge = currentAge;
                oldestPerson = currentName;
            }
            else {
                if(currentAge > biggestAge) {
                    biggestAge = currentAge;
                    oldestPerson = currentName;
                }
            }
            
            if(gender == MALE) {
                if(currentAge > 30) {
                    menAbove30++;
                }
            }
            
            if(gender == FEMALE) {
                if(isHerTheFirstWoman(numberOfWomen)) {
                    ageOfYoungestWoman = currentAge;
                    youngestWoman = currentName;
                }
                else {
                    if(currentAge < ageOfYoungestWoman) {
                        ageOfYoungestWoman = currentAge;
                    }
                }
                
                if(currentAge < 18) {
                    womenUnder18++;
                }
            }
            
            numberOfPeople++;
            sumOfAges += currentAge;
            
            System.out.println("----------");
            
            System.out.print("Deseja continuar?\n[1] Sim\n[2] Não\nR: ");
            choice = keyboard.nextByte();
            
            if(choice != 1) {
                break;
            }
            
            keyboard.nextLine(); // Limpando o buffer
            i++;
        }
        
        System.out.println("------------------------------");
        System.out.println("PESSOA MAIS VELHA: " + oldestPerson);
        System.out.println("MULHER MAIS JOVEM: " + youngestWoman);
        System.out.println("MÉDIA DE IDADE: " + (sumOfAges / numberOfPeople));
        System.out.println("HOMENS ACIMA DE 30: " + menAbove30);
        System.out.println("MULHERES MENORES DE 18: " + womenUnder18);
        
    }
    
    public static boolean isFirstTime(int i) {
        return i == 1;
    }
    
    public static boolean isHerTheFirstWoman(int numberOfWomen) {
        return numberOfWomen == 0;
    }   
    
}
