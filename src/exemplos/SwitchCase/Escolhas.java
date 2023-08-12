package SwitchCase;
import java.util.Scanner;

public class Escolhas {
    public static void main(String[]args){

    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um dia e descobrirá o dia referente:");
    int x = sc.nextInt();
    String dia;
     
    switch (x) {
        case 1 :
            System.out.println("Segunda");
            dia = "segunda";
            break;
        case 2: 
            System.out.println("Terça");
            dia = "terça";
            break;
        case 3:
            System.out.println("Quarta");
            dia = "quarta";
            break;
        case 4:
            System.out.println("Quinta");
            dia = "quinta";
            break;
        case 5:
            System.out.println("Sexta");
            dia = "sexta";
            break;

            default:
            dia = "Dia invalido";

    } 



    sc.close();    
    } // fecha Main
}
