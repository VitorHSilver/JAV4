import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        /*
         * Depois da inserção dos números,peço que utilize a classe max e coloque o
         * maior dos 3 números na variavel Maior.
         */
        int Maior = max(n1, n2, n3);
        showResult(Maior);

        sc.close();
    }

    /*
     * O sistema vem no método e faz verificação número a número e guardo os que for
     * forem
     * verdadeiro na variavel Resultado, que retornará a variavel da classe
     * principal "Maior"
     */

    // função fora do Método Main
    public static int max(int x, int y, int z) {
        int resultado;
        if (x > y && x > z) {
            resultado = x;

        } else if (y > z) {
            resultado = y;
        } else {
            resultado = z;
        }
        return resultado;
    }

    public static void showResult(int valor) {
        System.out.println("Maior  = " + valor);
    }

}
