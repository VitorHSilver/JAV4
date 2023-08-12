package Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int lin = sc.nextInt();
        int col = sc.nextInt();

        int[][] ma = new int[lin][col];

        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                ma[i][j] = sc.nextInt();
            }
        }

        System.out.print("Número desejado:");
        int n = sc.nextInt();

        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                if (ma[i][j] == n) {
                    System.out.println("Posição:" + i + "," + j);
                }
                if (j > 0) {
                    System.out.println("Esquerda" + j + ma[i][j - 1]);
                }
                if (i > 0) {
                    System.out.println("Cima: " + ma[i - 1][j]);
                }
                if (j < ma[i].length - 1) {
                    System.out.println("Direita: " + ma[i][j + 1]);
                }
                if (i < ma.length - 1) {
                    System.out.println("Baixo: " + ma[i + 1][j]);
                }
            }

            sc.close();

        }
    }
}
