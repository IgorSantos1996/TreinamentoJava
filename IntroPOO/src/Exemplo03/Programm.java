package Exemplo03;

import java.util.Locale;
import java.util.Scanner;

public class Programm {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Entre com o nome do funcinario: ");
        employee.name = sc.nextLine();
        System.out.println("Entre com o salario bruto do funcinario: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.println("Entre com o imposto: ");
        employee.Tax = sc.nextDouble();
        System.out.println("Employee: " + employee.toString());
        System.out.println("Qual a porcentagem do aumento: ");

        double porcentagem = sc.nextDouble();
        employee.IncreaseSalary(porcentagem);
        System.out.println("Update data: " + employee.toString());

        sc.close();
    }
}
