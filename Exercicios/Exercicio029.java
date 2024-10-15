
package exercicio029;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio029 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        double salary, newSalary;
        int yearsOfWork;
        
        System.out.print("Nome do funcionario: ");
        name = keyboard.nextLine();
        System.out.printf("Salario de %s: ", name);
        salary = keyboard.nextDouble();
        System.out.printf("Anos trabalhados por %s: ", name);
        yearsOfWork = keyboard.nextInt();
        
        newSalary = calculateNewSalary(salary, yearsOfWork);
        
        System.out.println("---------------------");
        System.out.printf("Novo salário de %s: R$%.2f\n", name, newSalary);   
    }
    
    public static double calculateNewSalary(double salary, int yearsOfWork) {
        double newSalary = 0.0f;
        if(yearsOfWork < 3) {
            newSalary = salary + (0.03*salary);
        }
        else if( (yearsOfWork >= 3) && (yearsOfWork < 10) ) {
            newSalary = salary + (0.125*salary);
        }
        else {
            newSalary = salary + (0.2*salary);
        }
        return newSalary;
    }
    
}
