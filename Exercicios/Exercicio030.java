package exercicio030;

import java.util.Scanner;

/**
 * @author Anderson Luis
 */

public class Exercicio030 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float segment1, segment2, segment3;
        boolean isPossibleFormTriangle;
        String typeOfTriangle = "";
        
        System.out.print("Digite o tamanho (em M) do segmento 1: ");
        segment1 = keyboard.nextFloat();
        System.out.print("Digite o tamanho (em M) do segmento 2: ");
        segment2 = keyboard.nextFloat();
        System.out.print("Digite o tamanho (em M) do segmento 3: ");
        segment3 = keyboard.nextFloat();
        
        isPossibleFormTriangle = canSegmentsFormTriangle(segment1, segment2, segment3);
        
        if(isPossibleFormTriangle) {
            typeOfTriangle = defineTypeOfTriangle(segment1, segment2, segment3);
        }
        
        System.out.println(result(isPossibleFormTriangle, typeOfTriangle));   
    }
    
    public static boolean canSegmentsFormTriangle(float s1, float s2, float s3) {
        if( (s1 < (s1+s2)) && (s2 < (s1+s3)) && (s3 < (s1+s2)) ) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static String defineTypeOfTriangle(float s1, float s2, float s3) {
        if(s1 == s2 && s2 == s3) {
            return "EQUILÁTERO";
        }
        else if(s1 != s2 && s2 != s3) {
            return "ESCALENO";
        }
        else {
            return "ISÓSCELES";
        }
    }
    
    public static String result(boolean isPossibleFormTriangle, String typeOfTriangle) {
        if(isPossibleFormTriangle) {
            return "É possível formar um triângulo " + typeOfTriangle + " com esses segmentos.";
        }
        else {
            return "NÃO É possível formar um triângulo com esses segmentos.";
        }
    }
    
}
