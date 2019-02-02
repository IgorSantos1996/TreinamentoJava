package aplication;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> lista = new ArrayList<>();
        System.out.println("Entre com o número de funcionarios: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n): ");
            char c = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hours: ");
            double valueperhours = sc.nextDouble();
            if (c == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                lista.add(new OutsourcedEmployee(name, hours, valueperhours, additionalCharge));
            } else {
                lista.add(new Employee(name, hours, valueperhours));
            }
        }
        for (Employee emp : lista) {
            System.out.println(emp.getName() + "$ " + String.format("%.2f", emp.payment()));
        }
        sc.close();

    }
}
