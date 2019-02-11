package aplication;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        System.out.print("How many students for course A? ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            int n = sc.nextInt();
            a.add(number);
        }

        System.out.print("How many students for course B? ");
        number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            int n = sc.nextInt();
            b.add(number);
        }

        System.out.print("How many students for course C? ");
        number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            int n = sc.nextInt();
            c.add(number);
        }
        Set<Integer> Total = new HashSet<>(a);
        Total.addAll(b);
        Total.addAll(c);
        System.out.println("Total students: " + Total.size());
        sc.close();

    }
}
