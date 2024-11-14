package exercicio053;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio053 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        short currentAge;
        short currentGender;
        int menRegistered = 0;
        int womenRegistered = 0;
        int sumTotalPeopleAges = 0;
        int sumMenAges = 0;
        int womenAbove20 = 0;
        int i = 1;
        float groupAgeAverage;
        float menAgeAverage;
        
        while(i <= 5) {
            System.out.println("-----------------------------------");
            System.out.print("Digite a idade da " + i + "º pessoa: ");
            currentAge = keyboard.nextShort();
            
            sumTotalPeopleAges += currentAge;
            
            System.out.println("Digite o sexo dessa pessoa: ");
            System.out.println("[1] Masculino\n[2] Feminino");
            System.out.print("R: ");
            currentGender = keyboard.nextShort();
            
            if(currentGender == 1) {
                menRegistered++;
                sumMenAges += currentAge;
            }
            else {
                if(currentGender == 2) {
                    womenRegistered++;
                    if(currentAge > 20) {
                        womenAbove20++;
                    }
                }
            }
            
            i++;
        }
        
        groupAgeAverage = sumTotalPeopleAges / (menRegistered + womenRegistered);
        menAgeAverage = sumMenAges / menRegistered;
        
        System.out.println("HOMENS CADASTRADOS: " + menRegistered);
        System.out.println("MULHERES CADASTRADAS: " + womenRegistered);
        System.out.println("MÉDIA DE IDADE DO GRUPO: " + groupAgeAverage);
        System.out.println("MÉDIA DE IDADE DOS HOMENS: " + menAgeAverage);
        System.out.println("MULHERES ACIMA DE 20 ANOS: " + womenAbove20);
    }
    
}
