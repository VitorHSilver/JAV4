package VetorWclasseapplication;

import java.util.Locale;
import java.util.Scanner;

import VetorWclasseapplication.entitiesProduto.Produto;

/*
 *  Código mostrando como é utilizado vetores com classes externas(referencias)
 */
public class VetorWClasse {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n]; // instancio a clase com o vetor[] dou apelido e etc.
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Produto(name, price);// depois de colher informações nas variaveis eu declaro novamente, agora
                                               // indicando as variaveis para onde vou mandar(referencia)
        }
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPreco(); // aqui estou pegando dados da variavel preco lá da classe Produto.
        }
        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        sc.close();
    }
}
