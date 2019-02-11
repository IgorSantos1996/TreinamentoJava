package aplication;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
       /* Primeiro Exemplo
       Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Hack");
        set.add("Termometro");
        set.add("Olavo");
        set.add("OsCarlos");
        set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T');
        for (String p : set) {
            System.out.println(p);
        }
        */

       /*
       Segundo exemplo
       */
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);
        // Intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b); // elementos em comum nos conjuntos
        System.out.println(d);
        //Difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b); // remover do conjunto e{} todo mundo que ta no conjunto b
        System.out.println(e);


    }
}
