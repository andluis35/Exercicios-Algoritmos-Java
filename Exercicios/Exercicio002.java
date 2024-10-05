package exercicio002;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio002 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        
        System.out.print("Digite seu nome: ");
        name = keyboard.nextLine();
        
        System.out.println("Olá " + name + ", é um prazer te conhecer!");
    }
    
}
