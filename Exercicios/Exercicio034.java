package exercicio034;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio034 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float height, weight, imc;
        
        System.out.print("Insira sua altura (EM METROS): ");
        height = keyboard.nextFloat();
        System.out.print("Insira seu peso (EM KG): ");
        weight = keyboard.nextFloat();
        
        imc = weight / (height*height);
        
        System.out.println("----------------------");
        System.out.printf("IMC: %.2f\n", imc);
        System.out.print("Situação: " + checkImcSituation(imc));        
    }
    
    public static String checkImcSituation(float imc) {
        if(imc < 18.5) {
            return "ABAIXO DO PESO\n";
        }
        else if(imc >= 18.5 && imc < 25) {
            return "PESO IDEAL\n";
        }
        else if(imc >= 25 && imc < 30) {
            return "SOBREPESO\n";
        }
        else if(imc >= 30 && imc < 40) {
            return "OBESIDADE\n";
        }
        else {
            return "OBESIDADE MÓRBIDA\n";
        }
    }
    
}
