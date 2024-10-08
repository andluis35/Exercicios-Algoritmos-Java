package exercicio010;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio010 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float width, height;
        
        System.out.print("Digite a largura da parede: ");
        width = keyboard.nextFloat();
        System.out.print("Digite a altura da parede: ");
        height = keyboard.nextFloat();
        
        System.out.println("----------------------------");
        System.out.printf("AREA DA PAREDE: %.2fm^2\n", area(width, height));
        System.out.printf("TINTA NECESSARIA: %.1fL\n", inkRequired(width, height));
    }
    
    public static float area(float w, float h) {
        return w*h;
    }
    
    public static float inkRequired(float w, float h) {
        return area(w,h) / 2;
    }
}
