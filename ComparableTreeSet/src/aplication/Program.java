package aplication;

import entities.Product;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main (String [] args){
        Set<Product> set = new TreeSet<>();
        // quando usamos o treeSet, a classe do conjunto tem que implentar o Comparable<>
        // para que o treeSet ordene os objetos
        set.add(new Product("Tv", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set){
            System.out.println(p);
        }
    }


}
