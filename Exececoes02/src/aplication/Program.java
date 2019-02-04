package aplication;

import model.exceptions.DomainExcepetion;
import models.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Checkin date (dd/mm/yyyy): ");
            Date checking = sdf.parse(sc.next());
            System.out.print("Checkout date (dd/mm/yyyy): ");
            Date checkout = sdf.parse(sc.next());


            Reservation reservation = new Reservation(number, checking, checkout);
            System.out.println("Reservation: " + reservation.toString());
            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Checkin date (dd/mm/yyyy): ");
            checking = sdf.parse(sc.next());
            System.out.print("Checki date (dd/mm/yyyy): ");
            checkout = sdf.parse(sc.next());

            reservation.updateDate(checking, checkout);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid Date format.");
        } catch (DomainExcepetion e) {
            System.out.println("Error in reservation. " + e.getMessage());
        }
        sc.close();
    }
}
