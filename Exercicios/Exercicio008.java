package exercicio008;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio008 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float distancia;
        
        System.out.print("Digite uma distancia (em metros): ");
        distancia = keyboard.nextFloat();
        
        System.out.println("A distancia de " + distancia + "m corresponde a:");
        System.out.println(distancia/1000 + "Km");
        System.out.println(distancia/100 + "Hm");
        System.out.println(distancia/10 + "Dam");
        System.out.println(distancia*10 + "dm");
        System.out.println(distancia*100 + "cm");
        System.out.println(distancia*1000 + "mm");
    }
    
}
