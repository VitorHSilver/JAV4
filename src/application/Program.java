package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/* 
 * Exemplo de programa de estoque com entrada , saida e com valor atual do estoque
*/

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product(); // Chamando a classe product e instanciando.

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine(); // incluindo um nome a classe product e a variavel nome.

        System.out.print("Price:");
        product.price = sc.nextDouble();

        System.out.print("Quantity:");
        product.quantity = sc.nextInt();

        System.out.println();// mostrando o método toString do jeito que foi declarado para ser visualizado
        System.out.println("Product data:" + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt(); // criei uma variavel quantidade que informará abaixo a quantidade adicionada
                                     // pelo usuário
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data:" + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data:" + product);

        sc.close();
    } // fecha main
}
