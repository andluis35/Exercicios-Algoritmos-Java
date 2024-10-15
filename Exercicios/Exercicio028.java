package exercicio028;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio028 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float width, length, area;
        String typeOfTerrain;
        
        System.out.print("Digite a largura do terreno: ");
        width = keyboard.nextFloat();
        System.out.print("Digite o comprimento do terreno: ");
        length = keyboard.nextFloat();
        
        area = calculateArea(width, length);
        typeOfTerrain = defineTypeOfTerrain(area);
        
        System.out.println("-----------------");
        System.out.printf("AREA: %.2fm^2\n", area);
        System.out.printf("TERRENO: %s\n", typeOfTerrain);    
    }
    
    public static float calculateArea(float width, float length) {
        return width*length;
    }
    
    public static String defineTypeOfTerrain(float area) {
        String typeOfTerrain;
        if(area < 100) {
            typeOfTerrain = "POPULAR";
        }
        else if(area >= 100 && area < 501) {
             typeOfTerrain = "MASTER";
        }
        else {
             typeOfTerrain = "VIP";
        }
        return typeOfTerrain;
    }
    
}
