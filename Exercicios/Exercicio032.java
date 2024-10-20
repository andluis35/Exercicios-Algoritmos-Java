
package exercicio032;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio032 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        short computerChoice;
        short playerChoice;
        
        System.out.println("===================");
        System.out.println("JOGO DA ADIVINHAÇÃO");
        System.out.println("===================");
        
        computerChoice = defineComputerChoice();
        System.out.println("O computador fez a escolha dele...");
        System.out.print("Arrisque um palpite: ");
        playerChoice = keyboard.nextShort();
        
        printDivider();
        showIfPlayerGotRight(playerChoice, computerChoice);
        printDivider();
    }
    
    public static short defineComputerChoice() {
        return (short) Math.floor(Math.random() * 5 + 1);
    }
    
    public static void showIfPlayerGotRight(short playerChoice, short computerChoice) {
        String c = "%s\nVocê escolheu: %d\nO computador escolheu: %d";
        String choices;
        if(playerChoice == computerChoice) {
            choices = String.format(c, "VOCÊ ACERTOU! :D", playerChoice, computerChoice);
        }
        else {
            choices = String.format(c, "VOCÊ ERROU! :(", playerChoice, computerChoice);
        }
        System.out.println(choices);
    }
    
    public static void printDivider() {
        System.out.println("=-=-=-=-=-=-=-=-=-=");
    }
    
}
