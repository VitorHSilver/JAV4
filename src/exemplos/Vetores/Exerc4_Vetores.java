package Vetores;


import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
   tela todos os números pares, e também a quantidade de números pares.
 */

public class Exerc4_Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados:");
        int n = sc.nextInt();
        sc.nextLine();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número:");
            vect[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("\n NUMEROS PARES:");

        int contagem = 0;
        for (int i = 0; i < vect.length; i++) {
            int numeroPar = vect[i] % 2; // aqui pego o valor do vetor e Divido por 2 , tudo isso com o simbolo % onde
                                         // pega o resto da divisão
            if (numeroPar == 0) { // se o resto da divisão for igual a 0 conta 1 e mostra na tela após o
                                  // encerramento do looping
                contagem++;
                System.out.printf(vect[i] + " ");

            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES: " + contagem);
        sc.close();
    }
}
