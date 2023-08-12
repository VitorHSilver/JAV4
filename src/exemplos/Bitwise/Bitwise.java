package Bitwise;
import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        /*
         * verificação bit a bit
         * & os dois precisam ser verdadeiros
         * | uma das concições precisam ser verdadeiras
         * ^ (exclusivo) só aceita se uma condição falsa
         */

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        /* Verificando bit a bit se o 6° bit do número inserido é 1 */
        Scanner sc = new Scanner(System.in);
        int mask = 0b100000;
        int n = sc.nextInt();
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false");
        }
        sc.close();

        /*
         * utilizado em programação de baixo nivel (arduino, interface com rede,
         * micro-controlador)
         */
    }
}