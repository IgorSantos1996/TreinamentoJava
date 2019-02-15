package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full path name: ");
        String path = sc.nextLine();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }
            // achar a soma dos preços
            double avg = list.stream().map(p -> p.getPrice()).
                    reduce(0.0, (x, y) -> x + y) / list.size();
            System.out.println("Avg price: " + String.format("%.2f", avg));
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> names = list.stream()
                    .filter(x -> x.getPrice() < avg).map(x -> x.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());
            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
