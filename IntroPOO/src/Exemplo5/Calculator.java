package Exemplo5;

public class Calculator {
    public static final double PI = 3.14159;

    public static double circunference(double raio) {
        return 2 * PI * raio;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
