package FixacaoListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos empregados serão registrados: ");
        int n = sc.nextInt();
        List<Employee> lista = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            lista.add(new Employee(id, name, salary));
        }

        System.out.println("Entre com o ID do funcionario que receberá aumento: ");
        int id = sc.nextInt();
        Employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {

            System.out.println("Esse id não existe!");
        } else {
            System.out.println("Entre com a porcentagem do aumento: ");
            double percent = sc.nextDouble();
            emp.IncreasySalary(percent);

        }
        System.out.println("============================");
        System.out.println("Lista de empregados: ");
        for (Employee item : lista)
            System.out.println(item);

    }
}
