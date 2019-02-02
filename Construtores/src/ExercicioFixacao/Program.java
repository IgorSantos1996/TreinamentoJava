package ExercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta acc;
        System.out.println("Entre com o numero da conta: ");
        String numero = sc.nextLine();
        System.out.println("Entre com o nome do titular da conta: ");
        String titular = sc.nextLine();
        System.out.println("Terá deposito inicial: (y/n) ");
        char resp = sc.next().charAt(0);
        if (resp == 'y') {
            System.out.println("Entre com o valor do deposito inicial: ");
            double initial_deposit = sc.nextDouble();
            acc = new Conta(numero, titular, initial_deposit);
        } else {
            acc = new Conta(numero, titular);
        }
        System.out.println();
        System.out.println("Dados da conta");
        System.out.println(acc.toString());
        System.out.println();
        System.out.println("Entre com o valor do deposito: ");
        double deposito = sc.nextDouble();
        acc.Depositar(deposito);
        System.out.println("Conta atualizada: ");
        System.out.println(acc.toString());
        System.out.println();
        System.out.println("Entre com o valor do saque: ");
        double saque = sc.nextDouble();
        acc.Sacar(saque);
        System.out.println("Conta atualizada: ");
        System.out.println(acc.toString());
        sc.close();

    }
}
