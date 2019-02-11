package aplication;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));


        /* 1º jeito
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };
        list.sort(comp);
        */


        // 2º jeito - O mesmo pode ser feito usando expressões lambdas e funções arrow
        Comparator<Product> comp = (Product p1, Product p2) ->
                p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort(comp);

        for (Product p : list)
            System.out.println(p);
    }
}
