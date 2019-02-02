package aplication;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        // ja podemos instanciar um cliente :)
        Client client = new Client(name, email, birthDate);

        System.out.print("Entre com o status do pedido: ");
        System.out.println("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
        // agora que ja temos o status do pedido, podemos instanciar um pedido
        Order order = new Order(new Date(), orderStatus, client);
        System.out.println("How many itens to this order? ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) { // lendo os dados do produto
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("product name: ");
            sc.nextLine();
            String productname = sc.nextLine();
            System.out.print("Entre com o preço do produto: ");
            double preco = sc.nextDouble();
            System.out.print("Quantity: ");
            int qtd = sc.nextInt();
            // já podemos instanciar um produto com esses dados
            Product product = new Product(productname, preco);
            OrderItem orderItem = new OrderItem(qtd, preco, product);
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println("Order Summary: ");
        System.out.println(order);
        sc.close();


    }
}
