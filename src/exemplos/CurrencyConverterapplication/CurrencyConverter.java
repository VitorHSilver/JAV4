package CurrencyConverterapplication;

public class CurrencyConverter {

    // com ajuda do chatgpt, peguei o valor_atual*qtd_dolar * 1,06)
    public final static double tax = 0.06;

    public static double totalGasto(double valor_atual, double qtd_dolar) {
        return (valor_atual * qtd_dolar * (1 + tax));
    }

    // public static double valorTax(double totalGasto) {
    // return (totalGasto * tax);
    // }

    // public static double totalPagar(double totalGasto, double valorTax) {
    // return totalGasto + valorTax;
    // }

}
