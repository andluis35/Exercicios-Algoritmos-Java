package exercicio057;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio057 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float currentSalary;
        float menSalaries = 0.0f;
        float womenSalaries = 0.0f;
        final byte MALE = 1;
        final byte FEMALE = 2;
        byte gender;
        byte choice;
        int i = 1;  
        
        while(true) {
            System.out.println("==========================================");
            System.out.print("Digite o salário do " + i + "º funcionário: R$");
            currentSalary = keyboard.nextFloat();
            
            System.out.println("----------");
            
            System.out.print("Digite o gênero do " + i + "º funcionário:\n[1] Masculino\n[2] Feminino\nR: ");
            gender = keyboard.nextByte();
            
            if(gender == MALE) {
                menSalaries += currentSalary;
            }
            
            if(gender == FEMALE) {
                womenSalaries += currentSalary;
            }
            
            System.out.println("----------");
            
            System.out.print("Deseja continuar?\n[1] Sim\n[2] Não\nR: ");
            choice = keyboard.nextByte();
            
            if(choice != 1) {
                break;
            }

            i++;
        }
        
        System.out.println("==========================================");        
        System.out.printf("TOTAL DE SALÁRIO PAGO AOS HOMENS: R$%.2f\n", menSalaries);
        System.out.printf("TOTAL DE SALÁRIO PAGO ÀS MULHERES: R$%.2f\n", womenSalaries);
    }
    
}
