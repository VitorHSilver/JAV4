import java.util.Locale;
import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        
      Scanner a = new Scanner(System.in);
      Locale.setDefault(Locale.US);

      int qtd1,qtd2,cod1,cod2;
      double valor1,valor2,total,total2,total3;
      
      System.out.println("Bem vindo a loja! qual codigo e número");
      System.out.println("-----------------------//-----------------------");
      cod1=a.nextInt(); qtd1=a.nextInt(); 
      System.out.println("Valor da sua peça?");
      valor1=a.nextDouble();    total=qtd1*valor1;
      System.out.printf("Cesta n°1:   R$ %.2f%n" ,total);

      System.out.println("peça n°2, qual codigo e número");
      cod2=a.nextInt(); qtd2=a.nextInt(); 
      System.out.println("Valor da sua 2° peça  ?");
      valor2=a.nextDouble();    total2=qtd2*valor2;  
      System.out.printf("Cesta n°2: R$ %.2f%n",total2);
    
      System.out.println("-----------------------//-----------------------");
      total3=total+total2;
      
      a.close();

      System.out.printf("Valor total %.2f%n",total3);
      
      





    }
}
