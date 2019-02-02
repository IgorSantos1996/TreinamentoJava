package Exemplo03;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Room[] vet = new Room[10];

        System.out.println("Quantos quartos serão alugados: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(" ");
            System.out.println("Hospede # " + i + ":");
            System.out.println("Informe seu nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.println("Informe seu e-mail: ");
            String email = scanner.nextLine();
            System.out.println("Qual quarto deseja alugar ?");
            int quarto = scanner.nextInt();
            vet[quarto] = new Room(nome, email);

        }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if (vet[i] != null) {
                System.out.println(i + ": " + vet[i]);
            }
        }
        scanner.close();
    }
}
