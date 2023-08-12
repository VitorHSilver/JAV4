package SalarioFuncionarioapplication.entitiesFuncionario;

public class Funcionario {

    public String name;
    public double salary;
    public double tax;

    public double netSalary(double salary, double tax) {
        return salary - tax; // pega o salário bruto menos a taxa.

    }

    public void incrementSalary(double percentage) {
        salary += salary * percentage / 100.0; // pega o salário 6000.00 * 10.0 / 100 = 600 e soma com salary
    }

    public String toString() {
        return name + ", " + "$ " + String.format("%.2f", netSalary(salary, tax));
    }
}
