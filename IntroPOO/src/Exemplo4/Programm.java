package Exemplo4;

import java.util.Locale;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno student = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        student.nome = sc.nextLine();
        System.out.println("Informe a primeira nota do aluno: ");
        student.grade = sc.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        student.grade2 = sc.nextDouble();
        System.out.println("Informe a terceira nota do aluno: ");
        student.grade3 = sc.nextDouble();
        System.out.printf("Final Grade: %.2f%n", student.FinalGrade());
        if (student.FinalGrade() < 60.0) {
            System.out.println("Failed");
            System.out.printf("Missing %.2f Points%n", student.MissingPoints());
        } else {
            System.out.println("Pass");
        }
        sc.close();
    }
}
