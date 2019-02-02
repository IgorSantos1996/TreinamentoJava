package utils;

import java.util.Locale;
import java.util.Scanner;

public class Programm {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a dolar do preco: ");
        double preco = sc.nextDouble();
        System.out.println("Vai comprar quantos dolars: ?");
        double dolars = sc.nextDouble();
        double result = CurrencyConverter.DollarToReal(preco, dolars);
        System.out.printf("Quantia para ser paga em real = %.2f%n", result);

    }
}
