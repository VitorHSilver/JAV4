

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
   tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
   bem como os nomes dessas pessoas caso houver.
 */
public class Exerc3_Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas:");

        int n = sc.nextInt();
        sc.nextLine();
        Pessoa[] vect = new Pessoa[n]; // instanciando a classe com o vetor

        String nome;
        int idade;
        double altura;

        double soma = 0; // variavel zerada para haver soma no for
        for (int i = 0; i < vect.length; i++) {

            System.out.print("Nome:");
            nome = sc.nextLine();

            System.out.print("Idade:");
            idade = sc.nextInt();

            System.out.print("Altura:");
            altura = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Pessoa(nome, idade, altura); // após obter os dados das variaveis necessario, instaciamos
                                                       // novamente o vetor com a classe agora utilizando a referencia
                                                       // das variaveis
            soma += vect[i].getIdade(); // utilizamos um get para pegar as informações da variavel idade
        }

        int pessoaMenor = 0; // zerado para que toda vez que for acionado seja feito uma contagem
        for (int i = 0; i < vect.length; i++)
            if (vect[i].getIdade() < 16) {
                pessoaMenor++;
            }
        double percentage = (double) pessoaMenor / n * 100;

        System.out.printf("Pessoas com menos de 16 anos: %.2f%% %n", percentage, " ", "%"); // %% para que possa
                                                                                            // utilizar a expressão de
                                                                                            // porcentagem
        double media = 0;
        media = soma / vect.length;

        System.out.print("Altura média: " + media);
        System.out.println();

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        sc.close();
    }
}
