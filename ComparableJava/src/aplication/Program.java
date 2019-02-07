package aplication;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "C:\\Windows\\Temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String EmployeeCsv = br.readLine(); //ler uma linha do arquivo
            while (EmployeeCsv != null) { // enquanto essa linha for diferente de nulo
                String[] fields = EmployeeCsv.split(",");
                //recortar o arquivo quando achar um ponto e virgula
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                // cria o vetor, a na posicão 0 tem um campo, e na posicão 1 tem outro campo
                EmployeeCsv = br.readLine();
            }

            Collections.sort(list);//ordenar minha lista com o método sort()
            for (Employee emp : list) // percorrendo a lista
                System.out.println(emp.getName() + ", " + emp.getSalary()); //imprimindo cada um dos elementos

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}