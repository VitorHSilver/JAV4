package entities;

import java.util.Locale;
import java.util.Scanner;
import application.CurrencyConverter;

public class ConverterCoins {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do dolar atual:");
        double valor_atual = sc.nextDouble();

        System.out.print("Quantos dolares você vai comprar:");
        double qtd_dolar = sc.nextDouble();

        /**
         * chamando o metodo depois de apenas importa-lo, sem precisar criar um OBJ
         * pegando as variaveis necessarias para o método funcionar
         */

        double dolar = CurrencyConverter.totalGasto(valor_atual, qtd_dolar);

        System.out.printf("Preço a pagar em reais: %.2f %n", dolar);

        sc.close();
    } // fecha

}
