package ExemploListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programm {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Igor");
        list.add("Carlos");
        list.add("Bob");
        for (String item : list)
            System.out.println(item);
        System.out.println("====================");
        list.add(2, "Josefa");
        for (String item : list)
            System.out.println(item);
        System.out.println("====================");
        System.out.println(list.size());
        list.remove(4);
        for (String item : list)
            System.out.println(item);
        System.out.println("====================");

        list.removeIf(x -> x.charAt(0) == 'M'); //lambda, predicado
        // pega um valor X que é do tipo String e me retorna se esse X.charAt(0) for igual a 'M'
        System.out.println("====================");
        // encontrar a posicao do elemento
        System.out.println("Index de Bob: " + list.indexOf("Bob"));
        // filtrar a minha lista que fique apenas na lista que tem o nome com M inicial
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        for (String item : resultado)
            System.out.println(item);
        System.out.println("====================");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
