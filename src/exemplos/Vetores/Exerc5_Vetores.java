package Vetores;
import java.util.Locale;
import java.util.Scanner;

public class Exerc5_Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] vect = new int[n];
        int[] restResult = new int[n];
        int count = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite o número:");
            vect[i] = sc.nextInt();
            restResult[i] = vect[i] % 2;
        }

        System.out.println("\nPares:");

        for (int i = 0; i < vect.length; i++) {
            if (restResult[i] == 0) {
                count++;
                System.out.print(vect[i] + " ");
            } else {
                System.out.print("Impar:" + " " + vect[i]);
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("N° Pares:" + count);

        sc.close();
    }
}
