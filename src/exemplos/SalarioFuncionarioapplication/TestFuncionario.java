package SalarioFuncionarioapplication;

import java.util.Locale;
import java.util.Scanner;

import SalarioFuncionarioapplication.entitiesFuncionario.Funcionario;

/*
 * Código sobre salario e acrescimo sobre o salário de um funcionário
 */

public class TestFuncionario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println();
        System.out.print("Name:");
        funcionario.name = sc.nextLine();

        System.out.println();
        System.out.print("Gross salary:");
        funcionario.salary = sc.nextDouble();

        System.out.println();
        System.out.print("Tax:");
        funcionario.tax = sc.nextDouble();

        System.out.println(funcionario);

        System.out.println();
        System.out.print("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        funcionario.incrementSalary(percentage);

        System.out.println();
        System.out.print("Update data: " + funcionario);

        sc.close();
    }// fecha classe

}
