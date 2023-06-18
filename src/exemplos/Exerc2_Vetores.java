

import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio com números do tipo valor.
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 - Imprimir todos os elementos do vetor
 - Mostrar na tela a soma e a média dos elementos do vetor
 */

public class Exerc2_Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("quantos números você vai digitar:");
        int n = sc.nextInt();
        sc.nextLine();

        double[] vect = new double[n];

        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("digite um número:");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        for (int i = 0; i < vect.length; i++) {
            System.out.printf(vect[i] + " ");

        }
        System.out.println();
        double media = soma / vect.length;
        System.out.printf("SOMA:  %.2f %n", soma);
        System.out.printf("MÉDIA:  %.2f %n", media);
        sc.close();

    }
}