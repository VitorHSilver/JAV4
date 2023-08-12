package LojaProdutos.Programapplication.entitiesProduct;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValuesInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;

    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;

    }

    /*
     * To String foi utilizado para no momento que eu pedir no Main para retornar o
     * nome da classe
     * ele me voltar do jeito desejado
     */

    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price) // String.format(tipo de casas decimais desejada)variavel)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValuesInStock());
    }
}
