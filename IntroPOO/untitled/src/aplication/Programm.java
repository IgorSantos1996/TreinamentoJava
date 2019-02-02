package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n = sc.nextInt();
        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Informe a posicao " + (i + 1) + " do vetor: ");
            vet[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma = soma + vet[i];
        }
        double media = soma / n;
        System.out.printf("A média é: %.2f%n" , media);

        sc.close();
    }


}
