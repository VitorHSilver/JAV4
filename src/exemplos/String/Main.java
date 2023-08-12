package String;
import java.util.Scanner;

public class Main{
        
        public static void main(String[] args) {
        
        // scanner a entrada de dados    
        Scanner sc = new Scanner(System.in);
        // tipo de entrada do var     
        int x;
        String s1 , s2 ,s3;
        
        // chamar o leitor de variavel nextline para prosseguir depois do espaço
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        
        // tipo de print     
        
        System.out.println("DADOS DIGITADOS");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // fecha entrada
        sc.close();
         }






}