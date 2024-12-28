package exercicio089;

/**
 * @author Anderson Luis
 */

public class Exercicio089 {

    public static void main(String[] args) {
        gerador("Apache Netbeans", 3, 2);
    }
    
    public static void gerador(String message, int numberOfTimes, int borderType) {
        String border;
        
        switch(borderType) {
            case 1:
                border = "+-------=======-------+";
                break;
            case 2:
                border = "~~~~~~~~:::::::~~~~~~~~";
                break;
            case 3:
                border = "<<<<<<<<------->>>>>>>>";
                break;
            default:
                System.out.println("Tipo de borda inválido. Tente novamente!");
                return;   
        }
        
        System.out.println(border);
        
        for (int i = 1; i <= numberOfTimes; i++) {
            System.out.println("    " + message);
        }
        
        System.out.println(border);  
    }
    
}
