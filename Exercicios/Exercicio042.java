package exercicio042;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio042 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = 1;
        
        System.out.print("Digite um número: ");
        number = keyboard.nextInt();
        
        System.out.println("CONTAGEM:" + countUp(number));
    }
    
    public static String countUp(int n) {
        int i = 1;
        String count = "";
        
        while(i <= n) {
            count = count + " " + i;
            i++;
        }
        
        count += " Acabou!";
        return count;
    }
    
}
