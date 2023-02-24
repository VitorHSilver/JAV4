import java.util.Locale;

public class Main {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        

        // Variaveis
        String produto1 = "Computer";
        String produto2 = "Office Desk";

        int age     = 26;
        int code    = 5290 ;
        char gender = 'M';
        
        double price1  = 2100.0 ;
        double price2  = 650.50 ;
        double mensure = 53.234567;

        System.out.printf("%s  which price is : $ %.2f dolares%n  %s which price is: $ %.2f dolar%n   ", produto1, price1, produto2, price2);
        
        System.out.printf("Record: %d ages, code: %d  and gener: %c %n", age, code, gender);
        
        System.out.printf("Measue with eight decimal places: %.8f %n", mensure);
        System.out.printf("Rouded (three decimal places): %.3f%n", mensure);
        // mudar a localização do programa
        Locale.setDefault(Locale.US);
        
        System.out.printf("Us decimal point: %.3f%n", mensure);


    }
}
