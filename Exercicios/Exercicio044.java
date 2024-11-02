package exercicio044;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio044 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int firstNumber, lastNumber, increment;
        
        System.out.print("Digite o primeiro valor da contagem: ");
        firstNumber = keyboard.nextInt();
        System.out.print("Digite o último valor da contagem: ");
        lastNumber = keyboard.nextInt();
        System.out.print("Digite o incremento da contagem: ");
        increment = keyboard.nextInt();
        System.out.println("----------------------------------");
        System.out.println("Contagem: " + makeCount(firstNumber, lastNumber, increment));
    }
    
    public static String makeCount(int firstNumber, int lastNumber, int increment) {
        String count = "";
        
        if(isCountdown(firstNumber, lastNumber, increment)) {
            count += makeCountdown(firstNumber, lastNumber, increment);
        }
        
        if(isCountup(firstNumber, lastNumber, increment)) {
            count += makeCountup(firstNumber, lastNumber, increment);
        }
        
        return count;
    }
    
    public static boolean isCountdown(int firstNumber, int lastNumber, int increment) {
        return (firstNumber > lastNumber) && (increment < 0);
    }
    
    public static boolean isCountup(int firstNumber, int lastNumber, int increment) {
        return (firstNumber < lastNumber) && (increment > 0);
    }
    
    public static String makeCountdown(int firstNumber, int lastNumber, int increment) {
        String count = "";
        int i = firstNumber;
        
        while(i >= lastNumber) {
            count = count + i + " ";
            i += increment;  
        }
        
        count += "Acabou!";
        return count;
    }
    
    public static String makeCountup(int firstNumber, int lastNumber, int increment) {
        String count = "";
        int i = firstNumber;
        
        while(i <= lastNumber) {
            count = count + i + " ";
            i += increment;  
        }
        
        count += "Acabou!";
        return count;
    }
    
}
