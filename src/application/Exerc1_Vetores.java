package application;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
   e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */

public class Exerc1_Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("quantos números você vai digitar:");
        int n = sc.nextInt();
        sc.nextLine();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("digite um número:");
            vect[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) { // abaixo de ZERO ou seja, negativo!
                System.out.printf("Negativos: %d %n", vect[i]);
            } else {

            }
        }
        sc.close();
    }
}
