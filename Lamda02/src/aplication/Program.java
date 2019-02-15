package aplication;

import entities.Product;
import model.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 20.00));
        list.add(new Product("Tablet", 300.00));
        list.add(new Product("HD", 200.00));

        ProductService ps = new ProductService();
        double soma = ps.filteredSum(list, product -> product.getName().charAt(0) == 'T');
        System.out.println("Soma = " + String.format("%.2f", soma));
    }

}
