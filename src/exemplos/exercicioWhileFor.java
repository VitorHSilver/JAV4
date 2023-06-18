import java.util.Scanner;

public class exercicioWhileFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.close();

    }// fecha main

}// fecha classe
/**
 * 1 - exercicio
 * Escreva um programa que repita a leitura de uma senha até que ela seja
 * válida. Para cada leitura de senha
 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha
 * for
 * informada corretamente deve ser
 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere
 * que
 * a senha correta é o valor 2002.
 * 
 * Scanner sc = new Scanner(System.in);
 * int senha = sc.nextInt();
 * while (senha != 2002) {
 * System.out.println("Senha Invalida!");
 * System.out.println("tente novamente:");
 * senha = sc.nextInt();
 * }
 * System.out.println("Acesso permitido");
 * sc.close();
 */

/**
 * Exercicio 3
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
 * preferência de seus clientes. Escreva
 * um algoritmo para ler o tipo de combustível abastecido (codificado da
 * seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
 * Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
 * deve ser solicitado um novo código (até
 * que seja válido). O programa será encerrado quando o código informado for o
 * número 4. Deve ser escrito a
 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
 * tipo de combustível, conforme
 * exemplo.
 * 
 * 
 * 
 * int alcool = 0;
 * int gasolina = 0;
 * int diesel = 0;
 * 
 * System.out.println("Qual o tipo de combustivel? 1.Álcool 2.Gasolina
 * 3.Diesel");
 * int escolha = sc.nextInt();
 * 
 * while (escolha != 4) {
 * if (escolha == 1) {
 * alcool = alcool + 1;
 * } else if (escolha == 2) {
 * gasolina = gasolina + 1;
 * } else if (escolha == 3) {
 * diesel += 1;
 * }
 * escolha = sc.nextInt();
 * } // fecha while
 * System.out.println("Muito Obrigado!");
 * System.out.println("Álcool:" + alcool);
 * System.out.println("Gasolina:" + gasolina);
 * System.out.println("Diesel:" + diesel);
 */