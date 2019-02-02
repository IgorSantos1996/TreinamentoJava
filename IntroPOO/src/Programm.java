import entities.Triangule;

import java.util.Locale;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangule x = new Triangule();
        Triangule y = new Triangule();

        System.out.println("Entre com as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com as medida dos triângulo X: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areay = y.area();

        System.out.printf("Triangulo X area: %.4f%n ", areaX);
        System.out.printf("Triangulo Y area: %.4f%n ", areay);

        if (areaX > areay) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();

    }
}
