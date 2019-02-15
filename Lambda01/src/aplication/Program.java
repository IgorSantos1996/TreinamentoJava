package aplication;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //1- list.removeIf(x -> x.getPrice() >= 100.00);
        //2- list.removeIf(new ProductPredicate());
        //3- list.removeIf(Product::staticProductPredicate);
        //3- list.removeIf(Product::nonstaticProductPredicate);  NomeClasse::Método , reference methods

        /*4- Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        list.removeIf(pred);*/
        //for (Product p : list)
        // System.out.println(p);
        //list.forEach(new PriceUpdate());
        //list.forEach(Product::nonstaticProductPredicate);
        //Consumer<Product> cons = p -> {
        //   p.setPrice(p.getPrice() * 1.1);
        // };
        //list.forEach(System.out::println);
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}