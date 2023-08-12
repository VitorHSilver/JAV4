package Hotelapplicarion;

import java.util.Locale;
import java.util.Scanner;

import Hotelapplicarion.entitiesRent.Rent;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10]; // total de vetores

        System.out.print("Números de Quartos:"); // números de vetores utilizados
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // foi inicializado com 1 para que a númeração seja do 0 ao 10.
            System.out.println();
            System.out.println("Rent # " + i + ":");
            System.out.print("Nome:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("E-mail:");
            String email = sc.nextLine();
            System.out.print("N° do quarto:");
            int numero_quarto = sc.nextInt();

            /*
             * Aqui, estou pegando o vetor mencionado anteriormente e indicando onde quero
             * inserir o número do quarto dentro desse vetor. Ou seja se o vetor dentro do
             * vetor tem 10 niveis, eu indico por meio do número do quarto qual será seu
             * novo número
             * Por exemplo, se n° do quarto for igual a 5, o
             * objeto 'rent' será instanciado com o valor 5.
             */
            vect[numero_quarto] = new Rent(nome, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) { // se na condição eu colocar (vect != null) ele mostrará todos os vetores, porem
                                   // se eu colocar(vect[i] != null) ele mostara todos os que forem diferente de
                                   // null (ou seja todos que não forem vazio)
                System.out.println(i + ":" + vect[i]); // aqui só está mostrando por que crei na classe um toString.
            }

        }
        sc.close();

    }
}
