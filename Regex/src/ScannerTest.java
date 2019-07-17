import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("1 true 100 01");


        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        System.out.println("=============================");
        Scanner scanner2 = new Scanner("1 true 100 01");
        while (scanner2.hasNext())
            if (scanner2.hasNextInt()) {
                int i = scanner2.nextInt();
            } else if (scanner2.hasNextBoolean()) {
                boolean b = scanner2.nextBoolean();
                System.out.println(b);
            } else {
                System.out.println(scanner2.next());
            }
    }
}
