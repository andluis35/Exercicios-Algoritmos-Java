package exercicio031;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio031 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] options = {"Pedra", "Papel", "Tesoura"};
        short computerChoice;
        short playerChoice;
        short wantToStop = 1;
           
        do {
            printDivider();
            System.out.println("Faça sua escolha: ");
            System.out.println("[0] Pedra");
            System.out.println("[1] Papel");
            System.out.println("[2] Tesoura");
            System.out.print("R: ");
            playerChoice = keyboard.nextShort();
            
            if(!isInputValid(playerChoice)) {
                showInputErrorMessage();
                continue;
            }
            
            computerChoice = defineComputerChoice();
            printDivider();
            showWinner(options, playerChoice, computerChoice);
            printDivider();
            
            System.out.println("Deseja jogar novamente?");
            System.out.println("[1] Sim");
            System.out.println("[2] Não");
            System.out.print("R: ");
            wantToStop = keyboard.nextShort();
        } while(wantToStop == 1);
    }
    
    public static boolean isInputValid(short choice) {
        if(choice < 0 || choice > 2) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public static String defineWinner(String[] options, short playerChoice, short computerChoice) {
        final short ROCK = 0;
        final short PAPER = 1;
        final short SCISSORS = 2;
        String choices = "Player: " + options[playerChoice] + "\nComputador: " + options[computerChoice];
        
        if(playerChoice == ROCK && computerChoice == SCISSORS
           || playerChoice == PAPER && computerChoice == ROCK
           || playerChoice == SCISSORS && computerChoice == PAPER) {
            choices += "\nVOCÊ GANHOU!";
        }
        else if(computerChoice == ROCK && playerChoice == SCISSORS
           || computerChoice == PAPER && playerChoice == ROCK
           || computerChoice == SCISSORS && playerChoice == PAPER) {
            choices += "\nO COMPUTADOR GANHOU!";
        }
        else {
            choices += "\nEMPATE!";
        }
        
        return choices;
    }
    
    public static void showInputErrorMessage() {
        System.out.println("==================================");
        System.out.println("Entrada inválida. Tente novamente!");
        System.out.println("==================================");
    }
    
    public static short defineComputerChoice() {
        return (short) Math.floor(Math.random() * 3);
    }
    
    public static void showWinner(String[] options, short playerChoice, short computerChoice) {
        System.out.println(defineWinner(options, playerChoice, computerChoice));
    }
    
    public static void printDivider() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    
}
