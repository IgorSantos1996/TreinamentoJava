package aplication;

import entitites.Account;
import entitites.BusinessAccount;
import entitites.SavingsAccount;

public class Program {
    public static void main(String[] args) {/*
//        BusinessAccount businessAccount = new BusinessAccount();
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING BussinessAccount para Account .. subindo
        // uma conta empresarial é tbm uma conta normal "é um"
        Account acc1 = businessAccount;
        Account acc2 = new BusinessAccount(1003, "Boc", 0.0, 200.00);
        // uma conta poupança tbm uma conta normal "é um"
        Account acc3 = new SavingsAccount(100, "Ana", 0.0, 0.01);


        //DOWNCASTING Accont para BussinessAccount ... descendo
        // não pode fazer isso, BusinessAccount acc4 = acc2;
        // Porem podemos realizar um casting explicito da seguinte forma:
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //operação permitida logo abaixo (mas vai dar erro). acc3 foi instanciada como SavingsAccount e não como Business Account
        // BusinessAccount acc5 = (BusinessAccount) acc3;
        // Podemos testar se
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Emprestimo");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }
        */
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1100, "Maria", 1000.0, 0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Nob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

    }
}
