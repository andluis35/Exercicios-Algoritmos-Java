package exercicio021;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio021 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        short year;
        
        System.out.print("Insira um ano: ");
        year = keyboard.nextShort();
        
        if(isLeapYear(year)) {
            System.out.println("BISSEXTO");
        }
        else {
            System.out.println("NÃO BISSEXTO");
        }
    }
    
    public static boolean isLeapYear(short year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
    
}
