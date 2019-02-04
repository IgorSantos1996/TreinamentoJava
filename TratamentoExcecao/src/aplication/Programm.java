package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        method1();

    }
    public static void method1() {
        System.out.println("**** Method1 start");
        method2();
        System.out.println("**** Method1 end");

    }
    public static void method2() {
        System.out.println("**** Method2 start");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");

            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
        } catch (InputMismatchException x) {
            System.out.println("Entre com um numero.");
            // x.printStackTrace();
        }
        sc.close();
        System.out.println("****METHOD2 END");
    }
}
