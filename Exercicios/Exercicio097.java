package exercicio097;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio097 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        
        System.out.print("Digite o 1º número: ");
        n1 = keyboard.nextInt();
        System.out.print("Digite o 2º número: ");
        n2 = keyboard.nextInt();
        System.out.print("Digite o 3º número: ");
        n3 = keyboard.nextInt();
        System.out.println("---------------------");
        
        maior(n1, n2, n3);
    }
    
    public static void maior(int n1, int n2, int n3) {
        if((n1 > n2) && (n1 > n3)) {
            System.out.printf("O primeiro valor [%d] "
                            + "é maior que o segundo valor [%d] "
                            + "e maior que o terceiro valor [%d].\n", n1, n2, n3);
        }
        else if ((n2 > n1) && (n2 > n3)) {
            System.out.printf("O segundo valor [%d] "
                            + "é maior que o primeiro valor [%d] "
                            + "e maior que o terceiro valor [%d].\n", n2, n1, n3);
        }
        else if((n3 > n1) && (n3 > n2)) {
            System.out.printf("O terceiro valor [%d] "
                            + "é maior que o primeiro valor [%d] "
                            + "e maior que o segundo valor [%d].\n", n3, n1, n2);
        }
        else {
            if((n1 == n2) && (n2 == n3)) {
               System.out.println("Todos os valores são iguais."); 
            }
            else if(n1 == n2) {
                System.out.printf("O primeiro valor [%d] e o segundo valor [%d] são iguais.\n", n1, n2);
                maiorComDoisParametros(n2, n3);
            }
            else if(n1 == n3) {
                System.out.printf("O primeiro valor [%d] e o terceiro valor [%d] são iguais.\n", n1, n3);
                maiorComDoisParametros(n3, n2);
            }
            else if(n2 == n3) {
                System.out.printf("O segundo valor [%d] e o terceiro valor [%d] são iguais.\n", n2, n3);
                maiorComDoisParametros(n3, n1);
            }
        }
    }
    
    public static void maiorComDoisParametros(int n1, int n2) {
        if(n1 > n2) {
            System.out.printf("Além disso, [%d] > [%d]\n", n1, n2);
        }
        else if (n2 > n1) {
            System.out.printf("Além disso, [%d] > [%d]\n", n2, n1);
        }
    }
    
}
