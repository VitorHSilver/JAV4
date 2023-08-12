package String;
import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
     
   
    Locale.setDefault(Locale.US);
    Scanner a = new Scanner(System.in);

    int numero,horas_work;
    double valor,salario; 

    System.out.println("Bom dia, qual seu numero de cadastro?");
    numero=a.nextInt();
    
    System.out.println("Quantas horas trabalhadas?");
    horas_work=a.nextInt();    
    
    System.out.println("valor da sua hora?");
    valor=a.nextDouble();    
    
    salario = horas_work*valor;

    System.out.printf("Seu número é %d , Seu valor a receber R$ %.2f%n ", numero,salario);     
    a.close();

    }
}
