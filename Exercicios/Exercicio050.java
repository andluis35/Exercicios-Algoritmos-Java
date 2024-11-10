package exercicio050;

/**
 * @author Anderson Luis
 */

public class Exercicio050 {

    public static void main(String[] args) {
        String drawnNumbers = "";
        int numbersAboveFive = 0;
        int numbersDivisibleByThree = 0;
        int currentNumber;
        int i = 1;
        
        while(i <= 20) {
            currentNumber = drawNumber();
            drawnNumbers = drawnNumbers + currentNumber + " ";
            
            if(isCurrentNumberAboveFive(currentNumber)) {
                numbersAboveFive++;
            }
            
            if(isCurrentNumberDivisibleByThree(currentNumber)) {
                numbersDivisibleByThree++;
            }
            
            i++;
        }
        
        System.out.println("----------------------------------------------------");
        System.out.println("NÚMEROS SORTEADOS: " + drawnNumbers);
        System.out.println("NÚMEROS ACIMA DE CINCO: " + numbersAboveFive);
        System.out.println("NÚMEROS DIVISÍVEIS POR TRÊS: " + numbersDivisibleByThree);
        System.out.println("----------------------------------------------------");
    }
    
    public static int drawNumber() {
        return (int) Math.floor(Math.random() * 10) + 1;
    }
    
    public static boolean isCurrentNumberAboveFive(int currentNumber) {
        return currentNumber > 5;
    }
    
    public static boolean isCurrentNumberDivisibleByThree(int currentNumber) {
        return currentNumber % 3 == 0;
    }
    
}
