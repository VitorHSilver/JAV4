import java.util.Locale;
import java.util.Scanner;

/*
 * Exemplo de código onde os vectores são armazenados nas variaveis do tipo valor.
 */
public class Vetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("número de pessoas:");
        int n = sc.nextInt();

        /*
         * tipo do vetor,colchetes vazio, nome do vetor = new tipo[] <- quantidade de vetores
         */
        double[] vect = new double[n];
        /*
         * Sempre que for necessario utilizar vetor, o loop vem como complemento para inserção dos dados em cada vetor
         */
        double soma = 0.0; // double soma fora do for, para que eu possa pegar os dados dentro do loop e usa-lo fora
        for (int i = 0; i < n; i++) {
            System.out.print("altura das pessoas:");
            vect[i] = sc.nextDouble();
            soma += vect[i]; // se eu colocasse o numero manualmente ele soma toda vez que o [i] for incrementado

        }
        double media = soma / n;
        System.out.printf("média entre as %d pessoas %n", n);
        System.out.printf("média: %.2f", media);

        sc.close();
    }
}
