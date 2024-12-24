package exercicio085;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio085 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int TOTAL_PEOPLE = 5;
        final int MALE = 1;
        final int FEMALE = 2;
        String[] arrayOfNames = new String[TOTAL_PEOPLE];
        String currentName;
        byte[] arrayOfGenre = new byte[TOTAL_PEOPLE];
        byte currentGender;
        float[] arrayOfSalaries = new float[TOTAL_PEOPLE];
        float currentSalary;
        
        for(int i = 0; i < TOTAL_PEOPLE; i++) {
            System.out.print("Digite o nome da " + (i+1) + "ª pessoa: ");
            currentName = keyboard.nextLine();
            System.out.print("Digite o gênero da " + (i+1) + "ª pessoa:\n[1] Masculino\n[2] Feminino\nR: ");
            currentGender = keyboard.nextByte();
            System.out.print("Digite o salário da " + (i+1) + "ª pessoa: R$");
            currentSalary = keyboard.nextFloat();
            System.out.println("--------------------------------------------------------");
            
            arrayOfNames[i] = currentName;
            arrayOfGenre[i] = currentGender;
            arrayOfSalaries[i] = currentSalary;
            
            keyboard.nextLine(); // Limpando o buffer do teclado
        }
        
        for(int j = 0; j < TOTAL_PEOPLE; j++) {
            if(arrayOfGenre[j] == FEMALE) {
                if(arrayOfSalaries[j] > 5000) {
                    System.out.println("NOME: " + arrayOfNames[j] + "\t\tSALÁRIO: R$" + arrayOfSalaries[j]);
                }
            }
        }
        
    }
    
}
