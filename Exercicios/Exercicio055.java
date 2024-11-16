package exercicio055;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio055 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        byte computerChoice;
        byte playerChoice;
        byte attempts = 4;
        
        System.out.println("===================");
        System.out.println("JOGO DA ADIVINHAÇÃO");
        System.out.println("===================");
        
        computerChoice = defineComputerChoice();
        System.out.println("O computador fez a escolha dele...");
        
        while(attempts > 0) {            
            System.out.print("Arrisque um palpite (1 a 10): ");
            playerChoice = keyboard.nextByte();
            attempts--;
            
            printDivider();
            
            if(playerGotRight(playerChoice, computerChoice)) {  
                System.out.println("VOCÊ ACERTOU! :D");
                break;
            }
            else {
                System.out.println("VOCÊ ERROU! :(");
                System.out.println("RESTAM " + attempts + " TENTATIVA(S)");
            }
            
            printDivider();
        }
  
    }
    
    public static byte defineComputerChoice() {
        return (byte) Math.floor(Math.random() * 10 + 1);
    }
    
    public static boolean playerGotRight(short playerChoice, short computerChoice) {
        return playerChoice == computerChoice;
    }
    
    public static void printDivider() {
        System.out.println("=-=-=-=-=-=-=-=-=-=");
    }
    
}
