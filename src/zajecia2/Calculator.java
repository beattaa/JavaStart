package zajecia2;

public class Calculator {
    double a = 9.8;
    double b = 8.7;

    public static void add(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void subtract(double a, double b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public static void multiple(double a, double b) {
        System.out.println(a + " * " + b + " = " + a * b);
    }

    public static void divide(double a, double b) {
        System.out.println(a + " / " + b + " = " + a / b);
    }

    public static void main(String[] args) {
        Calculator.add(9, 3);
        Calculator.subtract(9, 3);
        Calculator.multiple(9, 3);
        Calculator.divide(9, 3);
    }
}
