package exercicio043;

/**
 * @author Anderson Oliver
 */

public class Exercicio043 {

    public static void main(String[] args) {
        String count = "";
        short i = 30;
        
        while(i >= 1) {
            if(isDivisibleByFour(i)) {
                count = count + "[" + i + "] ";
            }
            else {
                count = count + i + " ";
            }
            i--;
        }
        System.out.println(count);
    }
    
    public static boolean isDivisibleByFour(short i) {
        return i % 4 == 0;
    }
    
}
