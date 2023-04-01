import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 10;
        double resultado = 0;

        String continuar = "sim";
        while (!continuar.equals("nao")) {
            System.out.println("Escolha a operação matematica");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            int operacao = sc.nextInt();

            if (operacao == 1) {
                do {
                    System.out.println("-----------------------------------");
                    System.out.println("-------------// SOMA //------------");
                    System.out.println("Digite n1 + n2:");
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    resultado = n1 + n2;
                    System.out.println("Total da sua soma:" + " " + resultado);
                    System.out.println("-----------------------------------");
                    System.out.println("Deseja continuar?");
                    sc.nextLine();
                    continuar = sc.nextLine();
                } while (continuar.equals("sim"));

            } else if (operacao == 2) {
                do {
                    System.out.println("-----------------------------------");
                    System.out.println("----------// SUBTRAÇÃO //----------");
                    System.out.println("Digite n1 + n2:");
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    resultado = n1 - n2;
                    System.out.println("Total da sua subtração" + " " + resultado);
                    System.out.println("-----------------------------------");
                    System.out.println("Deseja continuar?");
                    sc.nextLine();
                    continuar = sc.nextLine();
                } while (continuar.equals("sim"));

            } else if (operacao == 3) {
                do {
                    System.out.println("-----------------------------------");
                    System.out.println("--------// MULTIPLICAÇÃO /---------");
                    System.out.println("Qual tabela deseja?");
                    int n = sc.nextInt();
                    for (int i = 1; i <= max; i++) {
                        resultado = n * i;
                        System.out.println(n + "x" + i + "=" + resultado);
                        System.out.println("-----------------------------------");
                    }
                    System.out.println("Deseja continuar?");
                    sc.nextLine();
                    continuar = sc.nextLine();
                } while (continuar.equals("sim"));
            } else if (operacao == 4) {
                do {
                    System.out.println("-----------------------------------");
                    System.out.println("------------// DIVISÃO /-----------");
                    System.out.println("Digite n1 + n2:");
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    resultado = n1 / n2;
                    System.out.printf("Total da sua divisão: %.2f%n", resultado);
                    System.out.println("-----------------------------------");
                    System.out.println("Deseja continuar?");
                    sc.nextLine();
                    continuar = sc.nextLine();
                } while (continuar.equals("sim"));

            }

        }

        System.out.println("fim");
        sc.close();
    }// fecha main
}// fecha classe
