package StatusOrder.entities.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Classes.Client;
import StatusOrder.entities.Order;
import StatusOrder.entities.OrderItem;
import StatusOrder.entities.Prod;
import StatusOrder.entities.application.enums.OrderStatus;

public class OrderSumary {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name:");
        String nameClient = sc.nextLine();
        System.out.print("E-mail:");
        String emailClient = sc.nextLine();
        System.out.print("BirthDate(dd/MM/YYYY):");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(nameClient, emailClient, birthDate);

        System.out.println("Enter order data");
        System.out.print("Status:");

        OrderStatus status = OrderStatus.valueOf(sc.next()); // ValueOf Converte o String para o valor correspondente no
                                                             // OrderStatus

        Order order = new Order(new Date(), status, client); // aqui instanciei o pedido mostrando new date() que puxa o
                                                             // horario do sistema
                                                             // status onde vai ser digitado e o nome do cliente puxando
                                                             // o proprio OBJ Client acima.

        System.out.print("How many items to this order:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Enter # " + (1 + i) + "," + "item data:");
            System.out.print("Product name:");
            String prod_name = sc.nextLine();
            System.out.print("Product price:");
            double prod_price = sc.nextDouble();
            System.out.print("Quantity:");
            int prod_qtd = sc.nextInt();
            sc.nextLine();

            Prod prod = new Prod(prod_name, prod_price);// instanciei a classe produto onde tinha name e price
            OrderItem item = new OrderItem(prod_qtd, prod_price, prod); // aqui instanciei uma classe associada ao
                                                                        // Prod onde tinha quantidade, e peguei o
                                                                        // restante dos dados do prod na linha
                                                                        // acima. ou seja inserindo nos parametros o OBJ
                                                                        // PROD

            order.addItem(item); // adicionando o order item na lista dos meus pedidos

        }
        System.out.println(order);
    }
}
