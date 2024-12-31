package exercicio092;

/**
 * @author Anderson Luis
 */

public class Exercicio092 {

    public static void main(String[] args) {
        parOuImpar(4);
    }
    
    public static void parOuImpar(int number) {
        if(number % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("ÍMPAR");
        }
    }
    
}
