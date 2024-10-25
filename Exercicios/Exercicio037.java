package exercicio037;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio037 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double currentSalary;
        double newSalary;
        byte gender;
        short yearsOfWork;
        
        System.out.print("Digite seu salário atual: R$");
        currentSalary = keyboard.nextFloat();
        
        printDivider();
        System.out.println("Com qual gênero se identifica?");
        System.out.println("[1] Masculino");
        System.out.println("[2] Feminino");
        System.out.print("R: ");
        gender = keyboard.nextByte();
        
        printDivider();
        System.out.println("Há quantos anos trabalha na empresa? ");
        System.out.print("R: ");
        yearsOfWork = keyboard.nextShort();
        
        newSalary = calculateNewSalary(currentSalary, gender, yearsOfWork);
        
        printDivider();
        System.out.printf("Seu novo salário é de R$%.2f\n", newSalary);
    }
    
    public static double calculateNewSalary(double currentSalary, byte gender, short yearsOfWork) {
        final byte MALE = 1;
        final byte FEMALE = 2;
        double newSalary = 0.0d;
        
        if(gender == FEMALE) {
            if(yearsOfWork < 15) {
                newSalary = currentSalary + (0.05*currentSalary);
            }
            else if(yearsOfWork >= 15 && yearsOfWork < 20) {
                newSalary = currentSalary + (0.12*currentSalary);
            }
            else {
                newSalary = currentSalary + (0.23*currentSalary);
            }
        }
        
        if(gender == MALE) {
            if(yearsOfWork < 20) {
                newSalary = currentSalary + (0.03*currentSalary);
            }
            else if(yearsOfWork >= 20 && yearsOfWork < 30) {
                newSalary = currentSalary + (0.13*currentSalary);
            }
            else {
                newSalary = currentSalary + (0.25*currentSalary);
            }
        }
        
        return newSalary;
    }
    
    public static void printDivider() {
        System.out.println("--------------------------");
    }
    
}
