package aplication;

import Excepetion.DomainException;
import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        Account acc = new Account(number, holder, balance, withdrawLimit);
        System.out.println();
        System.out.println("Entre com o valor para saque: ");
        double amount = sc.nextDouble();
        try{
            acc.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
        }catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        sc.close();
    }
}
