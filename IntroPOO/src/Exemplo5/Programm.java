package Exemplo5;

import java.util.Locale;
import java.util.Scanner;

public class Programm {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Entre com o raio : ");
        double raio = sc.nextDouble();

        double c = calc.circunference(raio);
        double v = calc.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);


        sc.close();
    }


}
