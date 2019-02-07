package aplication;

import design.ContractService;
import design.PaypalService;
import entities.Contract;
import entities.Installment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter contract data: ");
        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double totalvalue = sc.nextDouble();
        Contract contract = new Contract(number, date, totalvalue);
        System.out.print("Enter number of installments: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, n);

        System.out.println("Installments: ");
        for (Installment item : contract.getList()) {
            System.out.println(item);

        }
        sc.close();
    }
}
