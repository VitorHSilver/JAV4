import java.util.Scanner;

public class EstrEnq {
    public static void main(String[] args) {
        // enquando = while

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        // condição que pega a excessão como maioria| podendo utilizar o 0 como alvo
        // pedindo num == 0;
        // pegou o valor dos números digitados e somou junto ao número neutro ;0
        // boolean continuar = true;
        while (num != 0) {

            num = sc.nextInt();

        }
        System.out.println(num);
        sc.close();
    }// fecha main
}// fecha classe

/**
 * em forma de letras
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Digite um número:");
 * String pal = sc.nextLine();
 * 
 * int soma = 0;
 * // pegou o valor dos números digitados e somou junto ao número neutro ;0
 * // boolean continuar = true;
 * while (!pal.equals("nao")) {
 * 
 * System.out.println("digite novamente");
 * pal = sc.nextLine();
 * 
 * }
 * System.out.println(pal);
 * sc.close();
 */