package exercicio093;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio093 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int startOfCounting;
        int endOfCounting;
        int increment;
        
        System.out.print("Digite o INÍCIO da contagem: ");
        startOfCounting = keyboard.nextInt();
        System.out.print("Digite o FINAL da contagem: ");
        endOfCounting = keyboard.nextInt();
        System.out.print("Digite o INCREMENTO da contagem: ");
        increment = keyboard.nextInt();
        System.out.println("---------------------");
        
        contador(startOfCounting, endOfCounting, increment);
    }
    
    public static void contador(int start, int end, int increase) {
        for(int i = start; i <= end; i += increase) {
            System.out.print(i + " >> ");
        }
        System.out.println("FIM");
    }
    
}
